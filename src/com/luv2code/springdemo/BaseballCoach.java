package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	// define a private field for the dependency
	private FortuneService fortuneService;
	
	// define a Constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	
	public String getDailyWorkout() {
		return "Spend 30 minutes practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get the fortune
		return fortuneService.getFortune();
	}
}
