package com.class6;

import java.util.Scanner;

public class SwitchCalculater {

	public static void main(String[] args) {
		//HomeWork: Using scanner class create calculator. 
		//Allow user to enter 2 numbers and operator(+,-,*,/). 
		//Based on operator provide the result to user.
      Scanner scan=new Scanner(System.in);
      System.out.println("please enter first number");
      int num1=scan.nextInt();
      System.out.println("please enter second number");
      int num2=scan.nextInt();
      System.out.println("please enter operator (+,-,*,/)");
      char op=scan.next().charAt(0);
      int result;
      switch (op) {
      case '+':
    	  result= num1 + num2;
    	  break;
      case '-':
    	  result= num1-num2;
    	  break;
      case '*':
    	  result= num1*num2;
    	  break;
      case '/':
    	  result=num1/num2;
    	  break;
    	  default:
    		  result=0;
    		  
    		  }
      System.out.println(result);
	


		//homework 1 Program to find largest number among three numbers
//using nested if provided by a user (numbers must be distinct)
      System.out.println("first number");
      int a=scan.nextInt();
      System.out.println("second number");
      int b=scan.nextInt();
      System.out.println("third number");
      int c=scan.nextInt();
      
      if (a>b && a>c) {
    	  System.out.println("largest number is "+a);
      }else if( b>a && b>c) {
    	  System.out.println("largest number is "+b);
    	  
      }else {
    	  System.out.println("largest number is "+c);
    	  
      }
      
      //HW2 Write a program to find largest of three double values using if-else..
      //ifand logical operators provided by a user (numbers must be distinct)
		double number1 = 23.3;
		double number2 = 5.6;
		double number3 = 4.3;


		if (number1 > number2 && number1 > number3) {
			System.out.println("largest number is " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("largest number is " + number2);
		} else {

			System.out.println("largest number is " + number3);

		}
      
      
      
      
      
      




	}
	}
	
