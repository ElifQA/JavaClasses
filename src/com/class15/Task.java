package com.class15;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// lets ask user to enter browser
				// based on the input we say "Your selected browser is "	​
				
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter browser name");
				String browser = scan.nextLine();
				
				switch (browser.toLowerCase()) {//"chrome"
				case "firefox":
					System.out.println("Execution be performed on " + browser);
					break;
				case "chrome":
					System.out.println("Execution be performed on " + browser);
					break;
				case "ie":
					System.out.println("Execution be performed on " + browser);
					break;
				case "safari":
					System.out.println("Execution be performed on " + browser);
					break;
				default:
					System.out.println("Please enter valid browser");
				}

	}

}
