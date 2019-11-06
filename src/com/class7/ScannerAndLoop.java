package com.class7;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*
		 * ask user to enter name 5 times and our out put should be "good afternoon"
		 */
		Scanner scan = new Scanner(System.in);
		int count = 5;
		while (count < 10) {
			System.out.println("please enter your name");
			String name = scan.next();

			System.out.println("Good afternoon " + name);
			count++;

		}
		String name;
		int answer=1;
		
		while (answer<=5) {
			System.out.println("whats your name");
			name=scan.next();
			
			System.out.println("good afternoon "+name);
			answer++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
