package com.class24;

public class Task {
	/*Write a program  that will have a 4 different access levels of constructors
	 *  and create 3 objects of this class: 1 - inside same class; 
	 *  2 - from outside the class and observe result. 
	 * 3 - from different class inside different package
	 */

	public Task( ) {
		System.out.println("i am a public const");
	}
	Task(String str){
		System.out.println("i am a default const");
	}
	protected Task(int num) {
		System.out.println("i am a protected cons");
	}
	private Task(int num, int num2) {
		System.out.println("I am a private ");
	
	}
	
	
	public static void main(String[] args) {
		Task obj1=new Task("Hello");
		Task obj2=new Task("Elif");
		
	}
}
