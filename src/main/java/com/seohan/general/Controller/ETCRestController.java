package com.seohan.general.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.seohan.base.Mapper.CodeLibRepository;
import com.seohan.general.Domain.FoodTable;
import com.seohan.general.Domain.FoodTableKamtec;
import com.seohan.general.Domain.FoodTableLab;
import com.seohan.general.Domain.KakaoMessageModel;
import com.seohan.general.Domain.TemperatureData;
import com.seohan.general.Mapper.FoodTableKamtecRepository;
import com.seohan.general.Mapper.FoodTableLabRepository;
import com.seohan.general.Mapper.FoodTableRepository;
import com.seohan.general.Mapper.TemperatureRepository;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/general")
@Slf4j
@RestController
class ETCRestController {

	@Autowired
	private FoodTableRepository foodTableRepo;
	@Autowired
	private FoodTableKamtecRepository foodTableKamtecRepo;
	@Autowired
	private FoodTableLabRepository foodTableLabRepo;
	@Autowired
	private TemperatureRepository temperatureRepo;

	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	SimpleDateFormat formatsdf = new SimpleDateFormat("yyyy-MM-dd");

	@GetMapping("/foodTable")
	public @ResponseBody List<FoodTable> FoodTable(@RequestParam String gdate) throws Exception {
		FoodTable foodTable = new FoodTable();
		foodTable.setGdate(gdate);
		return foodTableRepo.findByGdate(foodTable.getGdate());
	}

	@GetMapping("/foodTableKamtec")
	public @ResponseBody List<FoodTableKamtec> FoodTableKamtec(@RequestParam String gdate) throws Exception {
		FoodTable foodTable = new FoodTable();
		foodTable.setGdate(gdate);
		return foodTableKamtecRepo.findByGdate(foodTable.getGdate());
	}

	@GetMapping("/foodTableLab")
	public @ResponseBody List<FoodTableLab> FoodTableLab(@RequestParam String gdate) throws Exception {
		FoodTable foodTable = new FoodTable();
		foodTable.setGdate(gdate);
		return foodTableLabRepo.findByGdate(foodTable.getGdate());
	}

	@GetMapping("/temperature")
	public @ResponseBody List<TemperatureData> TemperatureList(TemperatureData temperatureData) throws Exception {
		return temperatureRepo.TemperatureDataList(temperatureData.getCO_GB(), temperatureData.getCO_GB());
	}

	@GetMapping("/kakao")
	public void kakaoTest() throws Exception {
		String myResult = "";
		try {
			// URL 설정하고 접속하기
			URL url = new URL("http://localhost:8190/kakao/save"); // URL 설정

			HttpURLConnection http = (HttpURLConnection) url.openConnection(); // 접속
			// --------------------------
			// 전송 모드 설정 - 기본적인 설정
			// --------------------------
			http.setDefaultUseCaches(false);
			http.setDoInput(true); // 서버에서 읽기 모드 지정
			http.setDoOutput(true); // 서버로 쓰기 모드 지정
			http.setRequestMethod("POST"); // 전송 방식은 POST

			// --------------------------
			// 헤더 세팅
			// --------------------------
			// 서버에게 웹에서 <Form>으로 값이 넘어온 것과 같은 방식으로 처리하라는 걸 알려준다
			http.setRequestProperty("content-type", "application/json");
			http.setRequestProperty("Accept", "application/json");

			// --------------------------
			// 서버로 값 전송
			// --------------------------  
			JSONObject jsonObject = new JSONObject(); 			
			jsonObject.put("template_code", "COM_MMS_00");
			jsonObject.put("recipient_num", "01067766160");
			jsonObject.put("content", "test");

			KakaoMessageModel kakaoMessageModel = new KakaoMessageModel();
			kakaoMessageModel.setTemplate_code("COM_MMS_00");
			kakaoMessageModel.setRecipient_num("01067766160");
			kakaoMessageModel.setContent("test");
						
			ObjectMapper objectMapper = new ObjectMapper();
			String paramJSON = objectMapper.writeValueAsString(kakaoMessageModel);
			
			//paramJSON = jsonObject.toString();
			
			OutputStreamWriter outStream = new OutputStreamWriter(http.getOutputStream(), "UTF-8");
			PrintWriter writer = new PrintWriter(outStream);
			writer.write(paramJSON);			
			writer.flush();
			// --------------------------
			// Response Code
			// --------------------------
			// http.getResponseCode();

			// --------------------------
			// 서버에서 전송받기
			// --------------------------

			StringBuilder sb = new StringBuilder();
			int HttpResult = http.getResponseCode();
			if (HttpResult == HttpURLConnection.HTTP_OK) {
				BufferedReader br = new BufferedReader(new InputStreamReader(http.getInputStream(), "utf-8"));
				String line = null;
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				br.close();
				System.out.println("" + sb.toString());
			} else {
				System.out.println(http.getResponseMessage());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
