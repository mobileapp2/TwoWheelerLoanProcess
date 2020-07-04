package com.webo.app.twowheelerloan.loanprocess.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan
@EnableJpaRepositories
public class FinanceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceProjectApplication.class, args);
	}
	
	@Bean
	public RestTemplate rstemp()
	{
		RestTemplate rs=new RestTemplate();
		return rs;
	}

}
