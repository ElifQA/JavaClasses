package com.class8;

public class ForLoopPractice {

	public static void main(String[] args) {
	
		for (int i=0; i<=4; i++) {
			System.out.println("good morning");
			
		}
		for ( int i=1; i<=10; i++) {
			System.out.print(i);
		}
		
		for (int i=1; i<=100; i++) {
			System.out.println(i);
		}
		for (int i=100; i>=1; i--) {
			System.out.print(i);
		}
		for (int i=20; i>=1; i-=2) {
			System.out.println(i);
			
		}
		for (int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		for (int i=20; i<=50; i++) {
			if (i%2==1) 
			System.out.print(i);
				
		}
		//repl quesion
		for (int i=1; i<=6; i++) {
			System.out.println(i*3);
		}
	}

}
