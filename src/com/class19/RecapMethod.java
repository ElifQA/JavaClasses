package com.class19;

public class RecapMethod {//method is block of code
	
	void methodName(String str) {
		System.out.println("hello "+str);//method body
	}
	public static void main(String[]args) {
		RecapMethod obj=new RecapMethod();
		obj.methodName("Anton");
		//"anton"===argument value that we pass when we call a method
	}

}
