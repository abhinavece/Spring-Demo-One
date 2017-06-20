package com.heapdev.springDemo;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {		
		return "Run a hard 5 KM";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: "+fortuneService.getFortune();
	}
}
