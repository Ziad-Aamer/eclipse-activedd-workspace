/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springdemo;

import java.util.List;

public class Triangle {
 
    private Point pointA;
    private Point pointB;
    


    public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public void draw(){
        
//        for(Point p: points){
//            System.out.println(p);
//        }
		System.out.println(pointA + " " + pointB);
    }
    
}
