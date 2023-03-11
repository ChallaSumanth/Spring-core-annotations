package com.sumanth.springAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.sumanth.springAnnotation")
//to make it work without @Bean tag it will scan all components in project
public class AppConfig {
	
//	@Bean
//	public Samsung getPhone()
//	{
//		return new Samsung();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor()
//	{
//		return new Snapdragon();
//	}
}
