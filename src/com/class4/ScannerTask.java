package com.class4;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What's the amount of loan is needed?");
		
		int loan=scan.nextInt();
		
		if (loan<200000) {
			System.out.println("lend money");
			
		}else {
			System.out.println("reject");
		}
		//task2
		Scanner age = new Scanner(System.in);
		System.out.println("whats your age?");
		
		int customerage=age.nextInt();
		if (customerage>=18) {
		System.out.println("you will issue driver licence");
		}else {
			System.out.println("permit");
		}
		
		//task3
		Scanner input=new Scanner(System.in);
		System.out.println("whats your city?");
		String city=input.next();
		
		System.out.println("whats your city temp?");
		
		int F=input.nextInt();
		
		int convertTemp=(F-32)*5/9;
		
		System.out.println("The temperature is the city "+ city+" is "+ convertTemp);
		

		
		
		
	

	}

}
