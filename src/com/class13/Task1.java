package com.class13;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your class day: ");
	String day=scan.nextLine();
	if (day.trim().toLowerCase().equals("saturday")) {
		System.out.println("Saturday is your Java class");
	
	}else if(day.toLowerCase().equals("sunday")) {
		System.out.println("Sunday is your Git class");

	}else if(day.trim().toUpperCase().equals(" TUSEDAY")) {
		System.out.println(" Tuseday is your SDLC class");
	
	}else if(day.trim().toLowerCase().equals("thursday")) {
		System.out.println("Thursday is your Manual class");
	
	}else {
		System.out.println("envalid ");
		
	}
	
	}
	
	}

