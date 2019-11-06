package com.class5;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("do you have creditcard");
		boolean cc=scan.nextBoolean();
		
		if(cc) {
			System.out.println("what is the balance?");
			int balance=scan.nextInt();
			
			if(balance>1000) {
				System.out.println("please pay off");
			}else {
				System.out.println("you can spend more");
			}
		}else {
			System.out.println("would you like to apply for credit card");
		}
		
		
		
		
	
		
	}	

	}


