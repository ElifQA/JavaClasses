package com.class28;

public class Parent {
	String name="John";
	String lastName="Snow";
	
public void callName() {
	System.out.println(name+" "+lastName);

}
}
class Child extends Parent{
	String name="James";
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.callingMethod();
		obj.callName();
	}

	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
	}

	public void callingMethod() {
		callName();//BY DEFAULT THIS IS ADDED- SO WE ARE CALLING CURRENT CLASS METHOD
		super.callName();
	}
	}

