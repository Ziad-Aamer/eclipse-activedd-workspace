package com.springanno;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${fortunes}")
	private String[] fortunes;
	
	public void getFortunes() {
		for(String f:fortunes)
			System.out.println(f);
	}

	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String workOut() {
		return "Swim 1000 meters as a warm up.";
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
