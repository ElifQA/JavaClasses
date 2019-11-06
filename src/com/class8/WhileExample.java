package com.class8;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
	
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
		do {
			System.out.println("Is it raining?");
			isRain=scan.nextBoolean();
			
		}while(isRain);
		
		System.out.println("Go to the park");	
		
		boolean isRain1;
		do {
			System.out.println("is it raining");
			isRain1=scan.nextBoolean();
			
		}while(isRain1)	;
		System.out.println("go to the park");
		
		
		/*lets ask user to enter if it is raining or not 
		 * (true or false) as long as there is rain let's keep asking
		 * as soon as there is no rain ---you can go to the park
		 */
		boolean isRain2;
		do {
		System.out.println("is it raining");
		isRain2=scan.nextBoolean();
		}while(isRain2);
			System.out.println("go to park");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
