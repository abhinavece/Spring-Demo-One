package com.heapdev.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// Load the Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve bean from Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//Call Method on bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//Close the context
		context.close();
	}

}
