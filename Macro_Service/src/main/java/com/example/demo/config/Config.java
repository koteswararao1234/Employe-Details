package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Value("${macro.url}")
	private String macroUrl;

	@Bean
	public String macroUrl() {
		return macroUrl;
	}

}
