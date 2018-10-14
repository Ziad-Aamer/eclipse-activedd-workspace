package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ObjectMapper mapper = new ObjectMapper();	
			
			Student s= mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println(s);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	
	}

}
