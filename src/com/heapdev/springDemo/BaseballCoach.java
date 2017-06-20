package com.heapdev.springDemo;

public class BaseballCoach implements Coach {

	// Define a private field for dependency
	private FortuneService fortuneService;

	// Define a constructor for dependency injection
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes daily in batting practice.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
