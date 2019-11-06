package com.class6;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		
		//write program that will read three input
		
		Scanner scan;
		double quiz, mid, fin, average;

		scan=new Scanner(System.in);
		System.out.println("enter your quiz score");
		quiz=scan.nextInt();
		
		System.out.println("enter your midterm score");
		mid=scan.nextInt();
		
		System.out.println("enter your final score");
		fin=scan.nextInt();
		
		average=(quiz+mid+fin) /3;
		System.out.println("your average is "+average);
		
		
		if (average>90 && average<=100) {
			System.out.println("A");
		}else if(average>=70 && average<90) {
			System.out.println("B");
		}else if(average>=50 && average<70) {
			System.out.println("C");
		}else if(average<50) {
			System.out.println("F");
		}else {
			System.out.println("no score");
			
		}
		
		
		
	}

}
