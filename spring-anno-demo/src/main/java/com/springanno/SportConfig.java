package com.springanno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.springanno")
@PropertySource("classpath:fortunes.properties")
public class SportConfig {
	
	//define a bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	//define SwimCoach
	@Bean
	public SwimCoach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
