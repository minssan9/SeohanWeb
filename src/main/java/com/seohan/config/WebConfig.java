package com.seohan.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	private static final String[] EXCLUDE_PATHS = {
			"/auth/**",
			"/error/**"
			};


	@Autowired
	private Environment environment;

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		//방화벽에서 외부 접근 차단
		// external access will be blocked by firewall
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("GET", "POST", "PUT", "DELETE")
				.maxAge(3600);

//		registry.addMapping("/**")
//				.allowedOrigins("http://localhost:8091", "http://localhost:8090","http://localhost","http://ind.seohan.com","http://minssan9.seohan.com")
//				.allowedMethods("GET", "POST", "HEAD", "PUT", "DELETE", "OPTIONS")
//				.maxAge(3600);

//		String urls = environment.getProperty("cors.allowOrigin");
//		for(String url: urls.split(",")){
//			registry.addMapping("/**")
//					.allowedOrigins(url);
//		}

//		registry.addMapping("/fta/**")
//				.allowedOrigins("*")
//				.allowedMethods("GET", "POST");
//
//		registry.addMapping("/base/**")
//				.allowedOrigins("*")
//				.allowedMethods("GET", "POST");
	}

   @Bean
   public MultipartResolver multipartResolver() {

      StandardServletMultipartResolver multipartResolver = new StandardServletMultipartResolver();
      return multipartResolver;
   }


//	@Autowired
//	private JwtInterceptor jwtInterceptor;
//
//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(jwtInterceptor)
//						.addPathPatterns("/**")
//						.excludePathPatterns(EXCLUDE_PATHS);
//	}


//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("*");  // TODO: lock down before deploying
//        config.addAllowedHeader("*");
//        config.addExposedHeader(HttpHeaders.AUTHORIZATION);
//        config.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsFilter(source);
//    }
    
    
}