package com.class18;

public class EvenOrOdd {
	// Create a method that will take a number and
			// prints whether the number is even or odd.
	
	void evenNumber(int num) {
		if (num%2==0) {
			System.out.println(num +" is even number");
		}else {
			System.out.println(num+ " is odd number");
		}
		
	}
	
	// Create a method that will print whether given String is polindrome or not.
	
	void polindrome(String str) {
		String reverse="";
		for (int i=str.length()-1; i>0; i--) {
			reverse=reverse+str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println(str +" is polindrome");
		}else {
			System.out.println(str+ "is not polindrome");
		}
		
	}
	public static void main(System[]args) {
		EvenOrOdd obj=new EvenOrOdd();
		obj.evenNumber(5);
		obj.polindrome("kayak");
	}

}
