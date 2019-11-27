package com.class25_1;

public class CanWeOverload {
	//can we overload a private method? -yes
	
	private void methodOne() {
		System.out.println("I am method one");
	}
	private void methodOne(String str) {
		System.out.println("I am method one with "+str);
	}
	
	//can we overload a main method? yes
	//can we overload a static method? yes
	public static void main(String str) {
		System.out.println("I am a main method with String argument");
	}
	public static void main(String str, String[]arg) {
		System.out.println("I am a main method with 2 param");
		
	}
	public static void main(String[] args) {
		System.out.println("I am a main method with String array");
		CanWeOverload.main("String");
		String []array= {"A","B"};
		main("Hello",array);
	}
}
