package com.class18;

public class LargerNumber {
	
	
	
	/*Create a method that will take 2 parameters as a numbers and prints which
	 * number is larger.
	 */
	
	void larger(int num, int num2) {
		if (num> num2 ) {
			System.out.println(num+ " is largest number");
		}else if (num<num2) {
			System.out.println(num2+" is largest number");
			
		}else {
			System.out.println("numbers are equal");
		}
			
	}
	public static void main(System[]args) {
		LargerNumber obj=new LargerNumber();
		
		obj.larger(21,5);
	
	}
}
	
	
		

	


