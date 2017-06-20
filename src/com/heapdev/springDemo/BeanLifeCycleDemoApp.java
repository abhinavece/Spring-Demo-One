package com.heapdev.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		
		// Loading Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// retrieving bean from Spring bean container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the retrieved bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("Alpha Coach =>"+alphaCoach.getDailyWorkOut());
		System.out.println("Alpha Coach =>"+alphaCoach.getDailyFortune());
		
		System.out.println("Memory location for AlphaCoach: "+ alphaCoach);
		System.out.println("Memory location for theCoach: "+ theCoach);
		
		// close the connection
		context.close();
	}

}
