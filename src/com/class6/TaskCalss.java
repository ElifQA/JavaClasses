package com.class6;

import java.util.Scanner;

public class TaskCalss {
	public static void main(String[] args) {
		/*ask user to enter tho month they were born
		 * based on month define the season
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the month you were born");
		
		String month=scan.next();
	
		String season;
		if (month.equals("January") || month.equals("feb")  || month.equals("dec")) {
			season="Winter";
		}else if(month.equals("March") || month.equals("april") || month.equals("May")) {
			season="spring";
		}else if (month.equals("JUne")|| month.equals("July") || month.equals("august")) {
			season="Summer";
		}else if (month.equals("september") || month.equals("October") || month.equals("December")) {
			season="Fall";
		}else {
			season="unknown";
		}
		System.out.println("you were born in "+ season);
		System.out.println(month);
		
		
	}

}
