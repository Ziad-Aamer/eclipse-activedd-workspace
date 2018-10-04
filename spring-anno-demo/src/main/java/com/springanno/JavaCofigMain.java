package com.springanno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaCofigMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach myC = context.getBean("swimCoach",SwimCoach.class);
		
		System.out.println(myC.getFortune());
		System.out.println(myC.workOut());
		myC.getFortunes();

		context.close();
	}
}
