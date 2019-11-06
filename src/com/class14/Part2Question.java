package com.class14;

import java.util.Scanner;

public class Part2Question {

	public static void main(String[] args) {
		// Q6 Write a Java Program to find whether a String is palindrome or not?
		Scanner scan = new Scanner(System.in);
		String str, rev= "";
		
		System.out.println("enter a string");
		str = scan.nextLine();
		
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}
		if (str.equals(rev)) {
			System.out.println(str + " is palindrome");
		} else
			System.out.println(str + " is not polindrome");
		System.out.println("*******************");
		//question 7 Write a java program to check whether a given number is prime or not?
		
		
		
		
		
		// question 8 Write a Java Program to print first 10 numbers of Fibonacci
		// series.
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
