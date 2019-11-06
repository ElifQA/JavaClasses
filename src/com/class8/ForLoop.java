package com.class8;

public class ForLoop {

	public static void main(String[] args) {
		//say good morning 5 times
		//initialize;  test condition; increment
		for (int i=0;      i<=4;      i++) {
			System.out.println("Good morning");
		}
		
		//print numbers from 1-10
		
		for (int a=1; a<=10; a++) {
			System.out.println(a);
		}
		//print numbers 10-1
		for (int i=10; i>=1; i--) {
			System.out.println(i);
		}
		
		for (int i=0; i<50; i+=5) {
			System.out.println(i);
		}
		//task1
		for (int i=1; i<=100; i++) {
			System.out.print(i + " ");
		}
		//task2
		for (int i=100; i>=1; i--) {
			System.out.println(i);
		}
		//3 print even numbers 20-1
		for (int i=20; i>=1; i-=2) {
			System.out.println(i);
		}
		System.out.println("****************");
			
		//task4 print odd numbers 20-50
		for (int i=20; i<=50; i++) {
			if(i%2==1)
			System.out.println(i);
		}
		//second way
		for (int i = 21; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
	}

}
