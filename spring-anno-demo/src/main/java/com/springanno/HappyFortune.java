package com.springanno;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {

	public String getFortune() {
		// TODO Auto-generated method stub
		return "Take happy fortune @!";
	}

}
