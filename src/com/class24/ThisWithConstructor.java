package com.class24;

public class ThisWithConstructor {
	ThisWithConstructor(){
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this(); //used to call current class constructor
		System.out.println("I am constructor with 1 string parameter");
	}
	ThisWithConstructor(String str, String str1){
		this(str);//always must be a first statement
		//this(); in this case it is second statmnt --compiler error
		System.out.println("I am constructor with 2 string parameter");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj=new ThisWithConstructor("hello");
		//can we execute 2 constructor when creating an object?
		//yes it can be achieved using this()
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		ThisWithConstructor obj1=new ThisWithConstructor("hello", "Bye");
	}
}
