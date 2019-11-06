package com.class6;

import java.util.Scanner;

public class SwitchCountryHw {

	public static void main(String[] args) {

		// Ask user to enter their country and capture it.
		// Once values are captured print which language user speaks.

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your country");
		String country = scan.nextLine();
		String lang;

		switch (country) {
		case "Turkey":
			lang = "Turkish";
			break;
		case "US":
			lang = "English";
			break;
		case "France":
			lang = "French";
			break;
		case "mexico":
			lang = "Spanish";
			break;
		default:
			lang = "invalid";
		}
		System.out.println("your country is " + country + " and your language is " + lang);
	}

}
