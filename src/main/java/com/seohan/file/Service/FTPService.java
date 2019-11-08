package com.seohan.file.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.seohan.Config.FTPProperties;

@Service
public class FTPService { 
	private String URL; // FTP 접속지 IP
	private int PORT; // FTP 접속지 Port
	private String ID;  // ID
	private String PASSWORD;
	private String PATH; 
	
	ChannelSftp chSftp = null;
	FileInputStream fi = null;

	@Autowired
	public FTPService(FTPProperties ftpProp) {
		this.URL = ftpProp.getUrl();
		this.ID = ftpProp.getId();
		this.PASSWORD = ftpProp.getPassword();
		this.PORT = ftpProp.getPort();		
	}
	
	@Autowired
	public boolean connect() {
		// FTP 관련 객체 선언
		Session ses = null; // 접속계정
		Channel ch = null; // 접속
		JSch jsch = new JSch(); // jsch 객체를 생성
		try {
			// 세션 객체를 생성(사용자 이름, 접속할 호스트, 포트)
			ses = jsch.getSession(ID, URL, PORT);
			// 비밀번호 설정
			ses.setPassword(PASSWORD);
			// 세션과 관련된 정보를 설정
			Properties p = new Properties();
			// 호스트 정보를 검사하지 않음
			p.put("StrictHostKeyChecking", "no");
			ses.setConfig(p);
			
			System.out.println("연결중");

			// 접속
			ses.connect();
			// 채널을 오픈(sftp)
			ch = ses.openChannel("sftp");
			// 채널에 연결(sftp)
			ch.connect();
			// 채널을 FTP용 채널 객체로 개스팅
			chSftp = (ChannelSftp) ch;

			System.out.println("FTP 연결이 되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("FTP 연결에 실패했습니다.");
			return false;
		}
		return true;
	}

	public void disconnectFtp() {
		try {
			chSftp.quit(); // Sftp 연결 종료
			System.out.println("FTP 연결을 종료합니다.");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public void uploadFtp() {		
		connect();		
		String filePath = "D:/SFTP.txt"; // 나중에 DB에서 필요한 경로 당기면 good		
		File file = new File(filePath); // file 객체 생성 (파일 경로 입력)
		try {
			fi = new FileInputStream(file);
			chSftp.cd("/"); // 서버의 경로
			chSftp.put(fi, file.getName()); // 서버에 파일 보내기
		} catch (SftpException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				fi.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		disconnectFtp();
	}
}
