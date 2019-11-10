package interviewQuestion;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// Q6 Write a Java Program to find whether a String is palindrome or not?
		Scanner scan = new Scanner(System.in);
		String str, rev = "";

		System.out.println("enter a string");
		str = scan.next();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is polindrome");

		} else {
			System.out.println(str + " is not polindrome");
		}
		System.out.println("*********************");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a string");
		String st=sc.next();
		String reverse;
		
		}
	}

