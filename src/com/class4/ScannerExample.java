package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		/*scanner is a class in Java taht will allow us to take input from a user
		 */
		 
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		/*nextInt(); -for numbers
		 * nextLine(); -String
		 * nextDouble(); double
		 */
		int number=scan.nextInt();
		System.out.println("Entered number is "+number);
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		System.out.println("good afternoon "+ name);
		
		System.out.println("enter age");
		int age=scan.nextInt();
		
		int age1=age+10;
		System.out.println("your age after 10 years is "+age1);
		
		

	}

}
