package com.heapdev.springDemo;

public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes daily in batting practice.";
	}
}
