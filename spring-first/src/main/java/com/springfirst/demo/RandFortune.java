package com.springfirst.demo;

import org.springframework.stereotype.Component;

@Component
public class RandFortune implements FortuneService {
	
	private String a[] = {"Happy", "Lucky", "GOG"};
	public String getFortune() {
		// TODO Auto-generated method stub
		int rand = (int) (Math.random()* 3) ;
		return "UR DAY is " + a[rand];
	}

}

/*
 1 * 3 => 2.7 (int) => 3 
 
 
 
 */ 
