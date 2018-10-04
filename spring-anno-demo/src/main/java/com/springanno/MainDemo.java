package com.springanno;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myC = context.getBean("trackCoach",Coach.class);
		
		System.out.println(myC.getFortune());
		System.out.println(myC.workOut());
		
		context.close();
	}

}
