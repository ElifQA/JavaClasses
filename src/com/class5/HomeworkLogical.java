package com.class5;

import java.util.Scanner;

public class HomeworkLogical {

	public static void main(String[] args) {
		//write program to find largest of three double values using
		//if else if and logical operators provided by a user 
		Scanner scan=new Scanner(System.in);
		double num;
		double num2;
		double num3;
		
		System.out.println("enter first number");
		num=scan.nextDouble();
		System.out.println("enter second number");
		num2=scan.nextDouble();
		System.out.println("enter third number");
		num3=scan.nextDouble();
		
		if (num>num2 && num>num3) {
			System.out.println(num+"is the largest number");
		}else if(num2>num && num2>num3) {
			System.out.println(num2+ " is the largest number");
		}else if(num3>num && num3>num2) {
			System.out.println(num3+ " is the largest number");
			
		}else {
			System.out.println("invalid");
		}
		
		Scanner scanner=new Scanner(System.in);
	      System.out.println("Enter 3 different numbers, respectively");
	      
	      double A,B,C;
	      double max;
	      A=scanner.nextDouble();
	      B=scanner.nextDouble();
	      C=scanner.nextDouble();
	      
	      if(A>B && A>C) {
	        max=A;
	      }else if(B>C){
	        max=B;
	      }else{
	        max=C;
	      }
	      System.out.println("MAXIMUM NUMBER " + max);

	}
	
	

}
