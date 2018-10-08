package com.luv2code.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetails;
import com.luv2code.entity.Review;
import com.luv2code.entity.Student;

public class AppDemoManyToMany {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetails.class)
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Review.class)
								.buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();

			Course c1 = new Course("Intro to CS");			
			Course c2 = new Course("Math I");	
			
			
			Student s1 = new Student("Ahmed", "Mohamed", "Ahmed@wd.com");
			Student s2 = new Student("Sader", "Mohamed", "Sader@wd.com");
			Student s3 = new Student("Kola", "Mohamed", "Kola@wd.com");
			Student s4 = new Student("fae", "Mohamed", "fae@wd.com");
			
			c1.addStudent(s1);
			c1.addStudent(s3);
			
			c2.addStudent(s2);
			c2.addStudent(s1);
			c2.addStudent(s4);
			
			session.persist(c1);
			session.persist(c2);

			session.getTransaction().commit();
			
			session.close();
			
			//get 
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			
			Course c3 = new Course("Math III");	
			Student nstu = session.get(Student.class, 4);
			
			nstu.addCourse(c3);
			
			session.save(c3);

			session.getTransaction().commit();
			

			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Close session finally");
			session.close();
			factory.close();
		}
		
	}

}
