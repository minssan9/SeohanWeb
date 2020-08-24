//package com.seohan.file.Service;
//
//import java.io.BufferedOutputStream;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//import java.io.PrintWriter;
//
//import org.apache.commons.net.PrintCommandListener;
//import org.apache.commons.net.ftp.FTPClient;
//import org.apache.commons.net.ftp.FTPReply;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.seohan.config.FTPProperties;
//
//@Service
//public class FTPService {
//	private String URL; // FTP 접속지 IP
//	private int PORT; // FTP 접속지 Port
//	private String ID; // ID
//	private String PASSWORD;
//	private String PATH;
//	private FTPClient ftp;
//
//	@Autowired
//	public FTPService(FTPProperties ftpProp) {
//		this.URL = ftpProp.getUrl();
//		this.ID = ftpProp.getId();
//		this.PASSWORD = ftpProp.getPassword();
//		this.PORT = ftpProp.getPort();
//	}
//
//	public void open() throws IOException {
//		ftp = new FTPClient();
//
//		ftp.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
//
//		ftp.connect(URL, PORT);
//		int reply = ftp.getReplyCode();
//		if (!FTPReply.isPositiveCompletion(reply)) {
//			ftp.disconnect();
//			throw new IOException("Exception in connecting to FTP Server");
//		}
//		System.out.println("FTP connection success!");
//		ftp.login(ID, PASSWORD);
//	}
//	 
//	public boolean downloadFile(String source, String destination) throws IOException {
//		File destinationFile = new File(destination);
//		OutputStream out1 = new BufferedOutputStream(new FileOutputStream(destinationFile)); 
//		return   ftp.retrieveFile(source, out1);
//	}
//	public void putFileToPath(File file, String path) throws IOException {
//	    ftp.storeFile(path, new FileInputStream(file));
//	}
//	
//	public void close() throws IOException {
//		ftp.disconnect();
//	}
////	public void uploadFtp() {		
////		connect();		
////		String filePath = "D:/SFTP.txt"; // 나중에 DB에서 필요한 경로 당기면 good		
////		File file = new File(filePath); // file 객체 생성 (파일 경로 입력)
////		try {
////			fi = new FileInputStream(file);
////			chSftp.cd("/"); // 서버의 경로
////			chSftp.put(fi, file.getName()); // 서버에 파일 보내기
////		} catch (SftpException e) {
////			e.printStackTrace();
////		} catch (FileNotFoundException e) {
////			e.printStackTrace();
////		} finally {
////			try {
////				fi.close();
////			} catch (IOException e) {
////				e.printStackTrace();
////			}
////		}
////		disconnectFtp();
////	}
//}
