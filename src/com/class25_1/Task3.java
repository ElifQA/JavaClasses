package com.class25_1;

public class Task3 {
	
	/*Create 1 class with a private method that has 3 overloaded forms. 
 * Then call each overloaded method with specific arguments and observe result.
 */

	private void task() {
		System.out.println("no argument");
	}
	private void task(String str) {
		System.out.println("I am a private method "+str);
	}
	private void task(String str, String str2) {
		System.out.println("I am private method with 2 string "+str+str2);
	}
	
	
	
	
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.task();
		obj.task(" Hello");
		obj.task(" Hello", " world");
				

	}

}
