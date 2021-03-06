package com.springfirst.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(@Qualifier("randFortune")FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String workOut() {
		// TODO Auto-generated method stub
		return "Run the Track !!";
	}

	public String getHappyFortune() {
		// TODO Auto-generated method stub
		return "Tracker on " + fortuneService.getFortune();
	}
	
}
