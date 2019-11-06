package com.class5;

import java.util.Scanner;

public class LogicalHw {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("enter your quiz score");
		int quiz=scan.nextInt();
		
		System.out.println("enter your midterm score");
		int mid=scan.nextInt();
		
		System.out.println("enter your final score");
		int fin=scan.nextInt();
		
		int average=((quiz+mid+fin) /3);
		String grade;
		if (average>= 90 ) {
			grade="A";
			System.out.println("A");
		}else if(average>=70 && average<90) {
			System.out.println("B");
			grade="B";
		}else if(average>=50 && average<70) {
			System.out.println("C");
			grade="C";
		}else if(average<50) {
			System.out.println("F");
			grade="f";
		}else {
			grade="Invalid";
			
			
		}
		//task write a program to determine the classmode
		//if there is no rain -->classMode=inclass
		boolean isRain=true;
		if (!isRain) {
			System.out.println("in class");
		}else {
			System.out.println("online");
		}
		
		//task1
		System.out.println("enter your score");
		int score=scan.nextInt();
		
		if (score>=90 ) {
		System.out.println("A");
	}else if( score>=70 && score <90) {
		System.out.println("B");
	}else if(score >=50 && score <70) {
		System.out.println("C");
	}else if(score <50) {
		System.out.println("F");
	}else {
		System.out.println("no score");
		

	}
	}
}
