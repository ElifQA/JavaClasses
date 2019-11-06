package com.class7;

public class WhileLoopsPractice {

	public static void main(String[] args) {
		// how to print numbers from 1-20
		int i = 1;
		while (i <= 20) {
			System.out.println(i);
			i++;
		}
		// print numbers 10-30 all in 1 line
		int y = 10;
		while (y <= 30) {
			System.out.print(y);
			y++;
		}
		// how to print values 10 to 1
		int a = 10;
		while (a >= 1) {
			System.out.println(a);
			a--;
		}
		// print values from 50 to 20
		int x = 50;
		while (x >= 20) {
			System.out.println(x);
			x--;
		}
		System.out.println("-----------");
		// i want to print all even numbers from 1 to 20
		// 1 way increment value by 2
		int z = 2;
		while (z <= 20) {
			System.out.println(z);
			z += 2;
		}
		// 2 way using modulus
		int q = 2;
		while (q <= 20) {
			
			if (q % 2 == 0) {
				System.out.println(q);
			}
			q++;
		}
		System.out.println("************");

		// print only odd number 50 to 100
		int c = 50;
		while (c <= 100) {
			if (c % 2 == 1) {
				System.out.println(c);
			}
			c++;
		}
		// print only even numbers from100-1

		int number = 1;
		while (number <= 100) {
			if (number % 2 == 0) {
				System.out.println(number);

			}
			number++;
		}

		int a1=0;
		while (a1<13) {
			System.out.println(a1);
			a1+=2;
		}
		//repl
		int i1=1;
	    while (i1<=4){
	        System.out.println(i1);
	     i1++;	
	  
	    	 
	     }
	   
		}
		
	}



