package com.class25_1;

public class Overload {
	/*Create 1 class with a static method that has 3 overloaded forms. 
	 * Then call each overloaded method with specific arguments and observe result.
	 */
	
	public static void add() {
		System.out.println("no argument");
	}
	public static void add(int num) {
		System.out.println("1 integer with parameter "+num);
	}
	public static void add(int num, int num2) {
		int sum=num+num2;
		System.out.println("2 integer parameters "+sum);
	}
	public static void add(String str) {
		System.out.println("1 string parameter"+str);
	}

		public static void main(String[] args) {
			//Overload obj=new Overload();
			add();
			add(5);
			add(2,6);
			add(" hello");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
