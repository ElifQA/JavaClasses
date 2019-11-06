package com.class4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[]args) {
		
		Scanner scan=new Scanner(System.in); 
		System.out.println("Do you have a credit card?");
		boolean card=scan.nextBoolean();
		
		if (card) {
		System.out.println("what is balance on your card?");
		
		int in=scan.nextInt();
		if (in<=1000) {
			System.out.println("Please pay off");
		}else {
			System.out.println("can spend more");
		
		}}else {
			System.out.println("Do you want to get one?");
		
		}
		

	}
}
