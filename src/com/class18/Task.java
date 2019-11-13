package com.class18;

public class Task {
	/*
	 * Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 */
	void maxNumber(int num1, int num2) {

		if (num1 > num2) {
			System.out.println(num1 + " is larger than " + num2);
		} else {
			System.out.println(num2 + " is larger than " + num1);
		}
	}// Create a method that will take a number and
		// prints whether the number is even or odd.

	void evenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd ");
		}
		// Create a method that will print whether given String is palindrome or not.
	}

	void isPol(String str) {

		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println(str + " is polindrome");
		} else {
			System.out.println(str + " is not polindrome");

		}

	}

	public static void main(String[] args) {

		Task number = new Task();
		number.maxNumber(589, 458);
		number.evenOrOdd(69);
		number.isPol("madam");

	}

}
