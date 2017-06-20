package com.heapdev.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		// Loading Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieving bean from Spring bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the retrieved bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Alpha Coach =>"+alphaCoach.getDailyWorkOut());
		System.out.println("Alpha Coach =>"+alphaCoach.getDailyFortune());
		
		boolean result = alphaCoach == theCoach;
		
		System.out.println("Comparison of Coach Object::: "+ result );
		System.out.println("Memory location for AlphaCoach: "+ alphaCoach);
		System.out.println("Memory location for theCoach: "+ theCoach);
		
		// close the connection
		context.close();
	}

}
