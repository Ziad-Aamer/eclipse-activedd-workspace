/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {    
    
    public static void main(String args[]){
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("springDoc.xml");
        Triangle tri = (Triangle) context.getBean("triangle");
        tri.draw();
    }
}
