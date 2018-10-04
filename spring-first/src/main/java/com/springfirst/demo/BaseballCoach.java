package com.springfirst.demo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	
	public String workOut() {
		return "Hit the baseball with the base";
	}
	
	public String getHappyFortune() {
		return fortuneService.getFortune();
	}
}
