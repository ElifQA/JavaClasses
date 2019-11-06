package com.class7;

public class Loops {

	public static void main(String[] args) {
	
		//int a=10;
		//a=a+1;
		//a+=1;//shorthand
		//System.out.println(a);//12
		//a++; //increment operator
		//System.out.println(a);//13
		
		//int b=10;
		//b-=1;//9
		//b--;//decrement operator 
		//System.out.println(b);//b8
		
		// loops: to repeat same block of code
		//1.While 2.do while 3.for 4 advanced for loop/enhanced loop/for each loop
		//while loop syntax //initialize variable first(should be outside of the loop)
		
		int time=8;
		if (time<12) {
				System.out.println("good morning");
		}
		while (time<12) {//while condition is true
			System.out.println("Good Morning");
			time++;
		}
		//increment & decrement operators can be used 
		//only with variables;
		
		int c=23;
		c++;
		//1++; compiler error invalid argument
		
		//print GA 5 times
		int i=-1;
		while (i<4) {
			System.out.println("good afternoon");
			i++;
		}
		System.out.println("outside of loop");
		
		int x=1;
		while (x<=5) {
			System.out.println("good morning");
			x++;
		}
	}


	}



