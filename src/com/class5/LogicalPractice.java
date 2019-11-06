package com.class5;

public class LogicalPractice {

	public static void main(String[] args) {
	
		//if name is not Mary or anna then you are not sister
		
		String name="Marry";
		String name2="Anna";
		if (!(name.equals("Marry") || name2.equals("Anna"))) {
			System.out.println("you are not my sister");
			
		}else {
			System.out.println("You are my sister");
		}
		//lets compare 2 numbers using not operator
		int num=10;
		int num1=11;
		if (num==num1) {
			System.out.println("numbers are equal");
			
		}else {
			System.out.println("numbers are not equal");
		}
		 
		if (!(num==num1)) {
			System.out.println("numbers are not equal");
		}else {
			System.out.println("Numbers are equal");
			
			
		}			

	}

}
