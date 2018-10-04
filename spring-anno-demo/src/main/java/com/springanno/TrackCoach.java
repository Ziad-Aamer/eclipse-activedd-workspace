package com.springanno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired
	public TrackCoach(@Qualifier("randFortune") 
						FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public String workOut() {
		// TODO Auto-generated method stub
		return "Tracker Coach gooooo! " ;
	}

	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
