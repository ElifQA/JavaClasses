package com.class8;

import java.util.Scanner;

public class TaskExp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// create a program that will be asking user to apply for a credit card 10
		// times.
		// as soon as you get an yes from a user program should stop asking

		for (int i = 1; i <= 20; i++) {
			System.out.println("would you like to apply for a credit card");
			String answer = scan.next();

			if (answer.equalsIgnoreCase("yes")) {
				break;
			}

		}
		System.out.println("sure");
	
		// create a program that will be asking user to apply for a credit card 10
				// times.
				// as soon as you get an yes from a user program should stop asking
		String answer1;
		for (int i=1; i <=10; i++) {
		
			System.out.println("apply credit card");
			answer1=scan.nextLine();
			if (answer1.equals("yes")) {
				break;
			}
			
		}
		System.out.println("ok");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
