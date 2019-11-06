package com.class9;

public class Pattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("*");
		}
		System.out.println("-----------------");

		for (int k = 1; k <= 4; k++) {//rows
			for (int l = 1; l <= 6; l++) {//colum

				System.out.print("*");
			}
			System.out.println();
		
		}
		//*************
		for (int a=0; a<6; a++) {//rows outer loops take control
			for (int b=0; b<6; b++) {//colums
				System.out.print(a);
			}
			System.out.println();
		}
		

			for (int i=1; i<=5; i++) {
				for (int j=1; j<=5; j++) {
					System.out.print(j);
					
				}
				System.out.println();
			}
			for (int i=0; i<5; i++) {
				for (int j=1; j<=9; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			for (int i=1; i<=5; i++) {
				for (int j=5; j>=1; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
			for (int i=5; i>=1; i--) {
				for(int j=5; j>=1; j--) {
					System.out.print(i);
				}
				System.out.println();
			}
			
		}
	}

