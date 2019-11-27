package com.class25_1;

public class TaskOverloading {
	/*Create 1 class in which create a methods that will calculate the area (volume) of Rectangle
	Square
	Box
	Use separate class to test your code
	 */


		public  void area(int num1) {
			System.out.println("Arae of a Square is "+num1*num1);
		}
		
		public void area(int num1, int num2) {
			System.out.println("Area of rectangle is "+(num1*num2));
		}
		public void area(int num1, int num2, int num3) {
			System.out.println("Area of box is "+(num1*num2*num3));
		}
		
		public static void main(String[] args) {
			TaskOverloading obj=new TaskOverloading();
			obj.area(2);
			obj.area(2,5);
			obj.area(2,3,5);
			
			
			
		}
}

