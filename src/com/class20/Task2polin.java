package com.class20;

public class Task2polin {
	/*Create a method that will take a String and return whether 
	 * String is palindrome or not. 
	 * Method should be available to all classes within your projects.
	 */
	public boolean pal(String str) {
		boolean isPolindrome=false;
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
			}
		if (str.equalsIgnoreCase(reverse)){
		//System.out.println("polindrome");
			isPolindrome=true;
	} 
		else {
		//System.out.println("not polindrome");
			isPolindrome=false;
	}
	return isPolindrome;
	}

	public static void main(String[] args) {
		Task2polin obj=new Task2polin();
		boolean a=obj.pal("kayak");
		System.out.println(a);
	

	}

}
