package com.class3;

public class IfElseIf {
	public static void main(String[]args) {
		
		int num1=100;
		int num2=10;
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}else if(num1==num2){
			System.out.println("num1 is equal num2");
		}else {
			System.out.println("Num1 is smaller than num2");
		}
		int day=2;
		if (day==1) {
			System.out.println("Today is Monday.");
		}else if(day==2) {
			System.out.println("Today is Tuesday. I have SDLC class");
			
		}else if(day==3) {
			System.out.println("Today is Wednesday");
		}else if(day==4) {
			System.out.println("Today is Thursday");
		}else {
			System.out.println("I do not know this day");
		}
		System.out.println("Im done with if statemnt");
	}
	
}
	

