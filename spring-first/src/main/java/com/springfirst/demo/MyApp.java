package com.springfirst.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(myCoach.workOut());
		System.out.println(myCoach.getHappyFortune());
	
	}

}
