package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		// load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve the bean from spring container
		CricketCoach setterCoach=context.getBean("myCricketCoach",CricketCoach.class);
				
		// call methods on the bean
		System.out.println(setterCoach.getDailyWorkout());
		
		// call the new method for fortunes
		System.out.println(setterCoach.getDailyFortune());
		
		System.out.println(setterCoach.getEmail());
		
		System.out.println(setterCoach.getTeam());
		
		
		
		// close the context
		context.close();
		
	}

}
