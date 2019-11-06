package com.class9;

import java.util.Scanner;

public class Task3and4 {

	public static void main(String[] args) {
		
	 //Write a program that reads a range of integers (start and end point), 
		//provided by a user and then 
		//from that range prints the sum of the even and odd integers.
		
		Scanner scan=new Scanner(System.in);
		
		
		
		System.out.println("enter start number");
		int a=scan.nextInt();
		System.out.println("enter end point");
		int b=scan.nextInt();
		
		int sumOdd=0;
		int sumEven=0;
		for(int i=a; i<=b; i++) {
			if (i%2==0) {
				sumEven=sumEven+i;
			}else {
				sumOdd=sumOdd+i;
			}
		}
		System.out.println("sum of the even numbers: "+sumEven);
		System.out.println("sum of the odd numbers: "+sumOdd);
		
		
		
	}

}

