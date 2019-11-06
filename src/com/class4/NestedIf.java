package com.class4;

public class NestedIf {

	public static void main(String[] args) {
		
		
		//if statement inside another if statement
		//execude top to the botom
		boolean b=false;
		boolean classToday=true;
	if (b) {
			System.out.println("Hello");
	}
	if (classToday) {
			
			System.out.println("Hello friends");
			
			
		}else {
			System.out.println("Bye");
		}
		System.out.println("I am continues code");
		
		
		//nestedifpractice
		
		boolean isFriday=false;
		int day=31;
		
		if(isFriday) {
			System.out.println("Today is Friday");
			
			if (day==13) {
				System.out.println("I will watch movie");
			}else {
				System.out.println("I will watch comedy");
			}
		
		}else {
			System.out.println("Today is not Friday");
			}

	}

	}
