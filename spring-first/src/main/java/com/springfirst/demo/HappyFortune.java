package com.springfirst.demo;

import org.springframework.stereotype.Component;

public class HappyFortune implements FortuneService {

	public String getFortune() {
		return "This is your LuckyDAY !!";
	}

}
