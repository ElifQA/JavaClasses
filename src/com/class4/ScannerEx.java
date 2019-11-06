package com.class4;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[]args) {
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=keyboard.nextInt();
		
		System.out.println("Please enter second number");
		int num2=keyboard.nextInt();
		
		if (num1>num2) {
			System.out.println(num1+"is larger than " +num2);
		}else if (num1==num2) {
			System.out.println(num1+ " is equal "+num2);
		}else {
			System.out.println(num1+ "is smaller than "+ num2);
		}
		
		Scanner loan=new Scanner(System.in);
		System.out.println("what is amount of loan");
		int amount=loan.nextInt();
		
		if (amount <=200000) {
			System.out.println("lend the money");
		}else {
			System.out.println("rejected");
		}
		//task2
		Scanner age=new Scanner(System.in);
		System.out.println("what is your age");
		int costumer=age.nextInt();
		 if (costumer>=18) {
			 System.out.println("you will issue a driver license");
		 }else {
			 System.out.println("permit");
			 
			 
		 }
		//task3
	Scanner scan = new Scanner(System.in);
		
	}

}
