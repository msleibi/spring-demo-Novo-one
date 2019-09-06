package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	FortuneService fortuneService;
	String email;
	String team;
	

	// create no-arg Constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside the no-arg constructor");
	}
	
	// define Setter for dependency injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside the setter method- setFortuneService");
		this.fortuneService = fortuneService;
	}

	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		
		return team;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside the setter method- setEmailAddress");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside the setter method- setTeam");
		this.team = team;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return ("Practice fast bowling for 15 minutes");
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
