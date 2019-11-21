package com.phen.phtoapp.api.users.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ComponentScan(basePackages = "com.phen.phtoapp.api.users.beans")
public class AppConfig {
	
	@Lazy
	@Bean
	public Region getRegion() {
		return new Region();
	}

}
