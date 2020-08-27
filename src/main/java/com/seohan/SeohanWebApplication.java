package com.seohan;

import com.seohan.erp.mat.Dto.ItemBalanceSaveQuery;
import com.seohan.erp.mat.Mapper.ItemBalanceHeaderMapper;
import com.seohan.erp.mat.Mapper.ItemBalanceHisOldMapper;
import com.seohan.erp.mat.Service.ItemBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
@EnableScheduling
@Configuration
@PropertySource(value = {"classpath:account.properties" })
@CrossOrigin(origins = { "http://localhost:8091",  "http://localhost:8090",  "http://localhost"})
public class SeohanWebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SeohanWebApplication.class);
	}
  
	public static void main(String[] args)
	{
		SpringApplication.run(SeohanWebApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(){
		return new ApplicationRunner() {
			@Autowired
			ItemBalanceService itemBalanceService;

			@Autowired
			ItemBalanceHeaderMapper itemBalanceHeaderMapper;

			@Autowired
			ItemBalanceHisOldMapper itemBalanceHisOldMapper;

			@Override
			public void run(ApplicationArguments args) throws Exception {
				LocalDateTime oldDateTime = LocalDateTime.now().minusDays(150);
				String oldDate = oldDateTime.format(DateTimeFormatter.ofPattern("yyyyMMdd"));

				String savingDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
				String savingTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmm"));
				ItemBalanceSaveQuery itemBalanceSaveQuery = ItemBalanceSaveQuery.builder()
						.savingDate(savingDate)
						.savingTime(savingTime)
						.oldDate(oldDate)
						.build();
				itemBalanceService.saveBalanceOldByDate(itemBalanceSaveQuery);
//				itemBalanceHeaderMapper.saveBalanceHisHeader(itemBalanceSaveQuery);
			}
		};
	}
}
