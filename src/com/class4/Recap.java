package com.class4;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int num= 23;
	num = 90;
	num -=200; //-110=90-200
	num -= 110;
	num += 220;
	
	if(num > 0) {
		System.out.println(num +"positive");
	}else if (num== 0) {
		System.out.println("value of num is " + num);
		
	}else {
		System.out.println(num + "is a negative");
	}
	//even or odd
	int i=137;
	if (i%2==0) {
		System.out.println( i + " is an even number");
	}else {
		System.out.println(i+ "is an odd");
	}
	//2
	if (i%2!=0) {
		System.out.println(i +" is an odd");
	}else {
		System.out.println(i+ "is an even number");
	}
	int integer=8;
	if (integer%2==0) {
		System.out.println(integer+ " is even number");
	
	}else {
		System.out.println(integer + "is odd");
	}

	}

}
