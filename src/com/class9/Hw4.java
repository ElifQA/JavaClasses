package com.class9;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		//Write a guessing game where the user has to guess a secret number between 1 and 20.
				//After  every  guess  input,  the  program  tells the  user  whether  their  number  was  too large  or  too  small. 
				//The  program  will  keepasking  the  user  to  enter  the  number  until he  finds  the  correct  number. 
				//When  the correct answer is found the system should display "Congratulations!!. You got it!"
				
				

		Scanner scan = new Scanner(System.in);
		int secretNumber, guessNumber;
		secretNumber = 12;
		do {
			System.out.println("please guess my number from 1-20");
			guessNumber = scan.nextInt();

			if (guessNumber < secretNumber) {
				System.out.println("your number is too small");
			} else if (guessNumber > secretNumber) {
				System.out.println("your number is too large");

			}
		} while (guessNumber != secretNumber);
		System.out.println("congratulations");

	}

}
