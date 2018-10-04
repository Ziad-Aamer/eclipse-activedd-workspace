package com.springfirst.demo;

public class FootballCoach implements Coach{

	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String workOut() {
		// TODO Auto-generated method stub
		return "Hold the ball !!";
	}

	public String getHappyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
	}

}
