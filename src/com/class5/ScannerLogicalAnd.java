package com.class5;

import java.util.Scanner;

public class ScannerLogicalAnd {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter your age");
	int age=scan.nextInt();
	
	
	if (age>=1 && age<=3) {
		System.out.println("baby");
		//human="baby";
	}else if(age>3 && age<=5) {
		System.out.println("toddler");
		//human="toddler";
	}else if(age>5 && age<=12) {
		System.out.println("a kid");
		//human="kid";
	}else if (age>12 && age<=19) {
		System.out.println("teenager");
		//human="teenager";
	}else if(age>19){
		System.out.println("adult");
		//human="adult";
	}else {
		System.out.println("Invalid");
		//human="invalid";
		}
	System.out.println("you are a human");
	
	//to import short cut is ctr+shift+0---windows
	/*ask user to enter daily sales
	 * based on the sales range we want to give commission to the person
	 * if sales is <100 --commission is 10%
	 * if sales if between 100-200 ---commission of 20%
	 * 
	 */
	
	double salesAmount;
	double commission;
	System.out.println("Please enter you sales amount");
	salesAmount=scan.nextDouble();
	
	if (salesAmount>=1 && salesAmount<100) {
		//lets give user 10% of commission of sale
		commission=salesAmount*0.1;
	} else if (salesAmount >=100 && salesAmount <200) {
		//lets give user 20% commission of a sale
		commission =salesAmount*0.2;
		} else if (salesAmount >=200 && salesAmount<500) {
		//lets give user 30% commission of a sale
		commission =salesAmount*0.3;
		} else if (salesAmount>=500) {
		//lets give user 50% commission of a sale
		commission =salesAmount*0.5;
		} else {
		commission=0;
		}
		System.out.println("based on the sales your commission is " +commission);
		
	}
	
		
	}
	
	


