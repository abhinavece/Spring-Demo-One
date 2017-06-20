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
		return "Run a hard 5 KMs";
	}

	@Override
	public String getDailyFortune() {
		return "TrackCoach: "+fortuneService.getFortune();
	}
	
	// add init method
	
	public void doMyStartupStuff(){
		System.out.println("TrackCoach: Inside method doMyStartupStuff()");
	}
	
	
	// add destroy method
	
	public void doMyCleanupStuffYoYo(){
		System.out.println("TrackCoach: Inside method doMyCleanupStuffYoYo()");
	}

}
