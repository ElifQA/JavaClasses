package com.class6;

import java.util.Scanner;

public class ReplExer34 {
	public static void main(String[] args) {
		
	    
	    	    
		//task35
		Scanner scan;
		scan = new Scanner(System.in);
		int score;
		String eligibility = null;
		System.out.println("Do you need a loan ?");
		boolean loan = scan.nextBoolean();

		if (loan) {
			System.out.println("whats your score");
			score = scan.nextInt();

			if (score < 600) {
				eligibility = "Not Eligible";

			} else if (score > 600 && score < 700) {
				eligibility = "Maybe Eligible";
			} else if (score > 701 && score < 800) {
				eligibility = "Eligible";
			} else if (score > 800) {
				eligibility = "Definitely Eligible";

			}
		} else {
			eligibility = "Unknown";
		}
		System.out.println("The eligibility for credit is " + eligibility);

	}
}
