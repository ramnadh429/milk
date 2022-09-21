package com.cg.dms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FarmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FarmerApplication.class, args);
	}
	 @Bean 
	 RestTemplate getRs() {
		  RestTemplate rt=new RestTemplate();
		  return rt;
		  }

}
