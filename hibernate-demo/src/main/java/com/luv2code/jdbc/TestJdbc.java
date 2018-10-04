package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String pass = "hbstudent";
		
		try {
			
			System.out.println("Connecting to the database: " + jdbcUrl );
			Connection conn = DriverManager.getConnection(jdbcUrl, user, pass); 
			System.out.println("Success !!!!!!!!!" );
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
