package com.class2;

public class ArithmeticOperations {
	/*
	 * declare 2variables and initialize them perform addition, subsctraction,
	 * multiplication and vision
	 */

		public static void main(String[]args) {
			int num1, num2;
			
			num1=20;
			num2=10;
			System.out.println(num1+num2);
			System.out.println(num1-num2);
			System.out.println(num1*num2);
			System.out.println(num1/num2);
			
			System.out.println(num1+" "+num2);
			
			int sum=num1+num2;
			int sub=num1+num2;
			int mult=num1*num2;
			int div=num1/num2;
			
			System.out.println(sum);
			System.out.println(sub);
			System.out.println(mult);
			System.out.println(div);
			
			System.out.println("the addition of 2 numbers is " +sum);
			System.out.println("The subtraction of 2 number is "+ sub);
			System.out.println("The division of 2 number " + div);
			System.out.println("The multipication of number 2 is " + mult);
			
		}
	
}
