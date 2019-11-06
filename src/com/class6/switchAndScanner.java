package com.class6;

import java.util.Scanner;

public class switchAndScanner {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your gender");
		char gender=scan.next().charAt(0);
		String usergender;
		
		switch(gender) {
		case 'F':
			usergender="Female";
			break;
		case 'M':
		usergender="Male";
		break;
		default:
			usergender="unknown";
		}
		System.out.println("your gender is "+usergender);
	}

}
