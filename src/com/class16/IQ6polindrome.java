package com.class16;

public class IQ6polindrome {

	public static void main(String[] args) {
		String original="kayak";
		String reversed="";
		
		for (int i =original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
			//System.out.print(original.charAt(i));
		}
		if (original.equals(reversed)) {
				System.out.println("polindrome");
		}else {
			System.out.println("not polindrome");
		}
			
		
		

	}

}
