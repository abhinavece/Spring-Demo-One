package com.heapdev.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	
	public static void main(String[] args) {
		
		// load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from Spring bean container
		CricketCoach newCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on the retrieved bean
		System.out.println(newCoach.getDailyWorkOut());
		System.out.println(newCoach.getDailyFortune());
		System.out.println(newCoach.getEmailID());
		System.out.println(newCoach.getTeam());
		
		// close the context
		context.close();
	}
}
