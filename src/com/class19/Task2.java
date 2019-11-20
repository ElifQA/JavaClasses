package com.class19;

public class Task2 {
	//Write a method to return whether given number is prime or not?
	boolean isPrime(int num) {
		boolean prime=true;
		for (int i=2; i<=num; i++) {
			if (num%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
//      Create  class Student that will have a method getGrade.
		//Your method should accept the score of a student and return a grade:
//      score > 90 - A
//      score >80 - B
//      score >70 - C
//      score > 50 - D
//      anything else - F
		
		char getGrade(int score) {
			char grade='0';
			if (score >90) {
				grade ='A';
			}else if (score >80 && score <90) {
				grade='B';
			}else if(score >70 && score <80) {
				grade='C';
			}else if(score >50 && score < 70) {
				grade='D';
			}else {
				grade='F';
			}
			
			return grade;
		}
	

	public static void main(String[] args) {
		
		Task2 obj=new Task2();
		boolean prime=obj.isPrime(5);
		System.out.println(prime);
		
		char grade=obj.getGrade(85);
		System.out.println(grade);
		
	}

}
