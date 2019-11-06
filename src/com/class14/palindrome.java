package com.class14;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
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
		Scanner sc=new Scanner(System.in);
		String str1, rev1 = "";
		System.out.println("enter a string");
		str1 = sc.next();

		for (int i = str1.length() - 1; i >= 0; i--) {
			rev1 = rev1 + str1.charAt(i);
		}
		if (str1.equals(rev1)) {
			System.out.print(str1+" is pol");

		} else {
			System.out.println(str1+ "is not");
		}
		

	}

}
