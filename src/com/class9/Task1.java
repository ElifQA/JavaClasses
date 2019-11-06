package com.class9;

public class Task1 {

	public static void main(String[] args) {
	
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//task2
		for (int i=1; i<=5; i++) {//rows
			for (int j=1; j<=i; j++) {//colums
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=4; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=5; i>=1; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
			System.out.println("**********");
		
		
		for (int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		for (int i=0; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=5; i>0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
