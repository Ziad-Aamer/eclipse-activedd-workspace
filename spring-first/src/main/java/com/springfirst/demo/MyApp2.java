package com.springfirst.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
		FootballCoach coach2 = context.getBean("footballCoach", FootballCoach.class);
//		
//		System.out.println(coach.getHappyFortune());
//		System.out.println("I AM THE EMAIL " + coach.getEmail());
//		
		System.out.println(coach + " "  + coach2);
		
		
	}

}
