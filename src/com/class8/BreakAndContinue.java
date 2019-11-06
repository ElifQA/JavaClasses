package com.class8;

public class BreakAndContinue {

	public static void main(String[] args) {
		// break keyword breaks/exist the loop
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				break;
			}
			System.out.println(i);

		}
		System.out.println("i am outside of the loop");

		// continue -it will skip Current iteration
		for (int i = 1; i <= 5; i++) {
			if (i == 3 || i == 4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("********************");

		// i want to print nums from 1 to 20 except 5 6 7

		for (int a = 1; a <= 20; a++) {
			if (a >=5 && a<=17) { // dont use && for 3 variables
				break;
			}
			System.out.println(a);
			System.out.println("*************");
		}
		// print numbers from 1 to 50 except those are divisible by 3
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i);
		}

	}
}
