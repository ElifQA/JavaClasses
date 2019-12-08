package com.class31;

public interface Shape {
	/*Create an Interface ‘Shape’ with undefined methods as calculateArea and calculatePerimiter .
	 *  Create 2 child classes: Circle & Square that should have an implementation 
	 *of area and perimeter calculation. Test your code.
	 */

	void calculateArea();
	void calculatePerimeter();
}

	class Circle implements Shape {
		int radius=7;
		double pi = 3.14;
		@Override
		public void calculateArea() {
			System.out.println("Area of the circle: " + pi * radius * radius);
		}
		@Override
		public void calculatePerimeter() {
			System.out.println("Perimeter of the circle: " + 2 * pi * radius);
		}
	}
	class Square implements Shape{
		int a=4;
		int b=2;
		@Override
		public void calculateArea() {
		System.out.println("Area of Square:" +a*a );
			
		}

		@Override
		public void calculatePerimeter() {
			System.out.println("Area of perimeter : "+a+a+a+a);
			
		}
		
	}
