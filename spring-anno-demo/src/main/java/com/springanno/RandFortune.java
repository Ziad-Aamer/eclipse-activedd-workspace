package com.springanno;

import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class RandFortune implements FortuneService{

	@Value("${fortunes}")
	private String[] fortunes;
	
	@PostConstruct
	private void init() {
		System.out.println("Hello form the init method !!");

	}
	
	public String getFortune() {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int idx = ran.nextInt(5);
		return "ur fortune todaty is " + fortunes[idx];
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("Hi form the destroy method !!");
	}


}
