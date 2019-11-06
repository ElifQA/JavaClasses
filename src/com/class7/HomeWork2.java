package com.class7;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count;

		System.out.println("Please pay your coffee");
		count = scan.nextInt();

		while (count != 5) {
			System.out.println("pay your coffee");
			count = scan.nextInt();
		}
		System.out.println("enjoy your coffee");
		//second way
		int price;
		do {
			System.out.println("Please pay your coffee");
			price = scan.nextInt();
		} while (price != 5);// condition false
		System.out.println("enjoy your coffee");

		/*
		 * You need ask user to pay for coffee You need to keep asking user to pay for
		 * it until entered price is equal=5; After user paid then say
		 * "Enjoy your coffee!"
		 */
		int coffe;
		do {
			System.out.println("pay coffe");
			coffe = scan.nextInt();
		} while (coffe != 5);
		System.out.println("enjoy");
		
		
		
		int price1;
		do {
			System.out.println("coffe");
			price1=scan.nextInt();
		}while(price1!=5);
		System.out.println("enjoy");
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
