package com.heapdev.springDemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailID;
	private String team;

	public CricketCoach() {
		// No args constructor
		System.out.println("CricketCoach::: Inside no-args constructor Coach");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("CricketCoach::: Inside setter method - setFortuneService");
	}
	
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice fast bowling daily.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}	
	
	public String getEmailID() {
		return emailID;
	}
	
	public String getTeam() {
		return team;
	}

}
