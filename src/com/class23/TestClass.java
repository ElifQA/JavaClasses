package com.class23;

public class TestClass {
	/*Write a program that will have a constructor: 
	 * one with parameters and second without any parameters. 
	 * Create a separate Test class where you will execute both of the constructors.
	 */
	String str;
	
	TestClass(){
		System.out.println("with no parameters");
	}
	
	TestClass(String str1){
		str=str1;
		System.out.println("with parameters");
	}
	
	public static void main(String[] args) {
		TestClass obj=new TestClass();
		TestClass obj2=new TestClass("hello");
	
		
	}

}
