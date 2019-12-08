package com.class28;
/*Write program: Shape class has a constructor that takes the
 *  radius and extend circle class. 
 * Print area of circle while creating and Object of a child class.
 */

public class Shape {
	double radius;
	
	Shape(double radius) {
		this.radius=radius;
	}
	

}
class Circle extends Shape{
	
	Circle(double radius){
		super(radius);
		
		
	}
	public void printArea() {
		System.out.println("Area of circle "+3.14*radius);
	}
	
}
	



