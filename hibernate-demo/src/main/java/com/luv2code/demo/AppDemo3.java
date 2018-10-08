package com.luv2code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetails;
import com.luv2code.entity.Review;

public class AppDemo3 {
	
	
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
			
			Review r1 = new Review("This Course is great !");
			Review r2 = new Review("This Course is bad !");
			Review r3 = new Review("This Course is good !");
			
			c1.addReview(r1);
			c1.addReview(r2);
			c1.addReview(r3);
			
			session.persist(c1);
			
			session.getTransaction().commit();
			
			session.close();
			
			//get the course reviews
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			
			/*
			Query<Course> query = session.createQuery("from Course c join fetch c.reviews"
										+ " where c.id=:courseId",Course.class)
										.setParameter("courseId", 1);
			Course cc = query.getSingleResult();
			System.out.println(cc);
			System.out.println(cc.getReviews());
			*/
			Course cc = session.get(Course.class, 1);
			//session.delete(cc);
			
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
