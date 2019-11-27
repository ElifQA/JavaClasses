package com.class24;

public class Test {

	public static void main(String[] args) {
	
		Child1 child1=new Child1();
		System.out.println(child1.race);
		System.out.println(child1.hairColor);
		System.out.println(child1.eyeColor);
		child1.sign();
		child1.code();
		Parent parent=new Parent();
		System.out.println(parent.race);
		System.out.println(parent.hairColor);
		System.out.println(parent.eyeColor);
		parent.sign();
		//parent.code();compiler give error  you cannot access it was in child class
		//parent.draw();it was child class
		Child2 child2=new Child2();
		System.out.println(child2.race);
		System.out.println(child2.hairColor);
		System.out.println(child2.eyeColor);
		System.out.println("she likes dance");
		child2.sign();
		child2.draw();
		//child2.code();it was in child1 you cannot access
		
		

	}

}
