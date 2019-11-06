package com.class12;

public class StringMinipulationDemo {

	public static void main(String[] args) {
		//String Literal
		String name="Jhon";
		System.out.println(name);
		System.out.println("the length of name is" +name.length());
		
		//2
		//creating string with new key word
		String name1=new String("Jhon1");
		System.out.println(name1);
		
		/*this method return the length of this string.
		 * the length is equal to the number
		 * of 16 bit Unicode characters in the string. 
		 */
		int name1Len=name1.length();
		System.out.println("The length of name1 is = "+name1Len);
		
		//toLowercase
		String str1="Hello WoRld";
		System.out.println("before : "+str1);
		str1=str1.toLowerCase();
		System.out.println("After : "+str1);
		
		//equals()This method compares this String to another String. 
		//The result is true only if the argument is not null and if a 
		//String object that represents the same sequence of characters as this object.
		String str2="HEllo WoRld";
		boolean isEqual=str1.equals(str2);
		System.out.println(isEqual);
		
		//equalsignorecase
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//toUpperCase
		//this method convert all of the characters in this string to uppercase
		String str3="Melek";
		System.out.println("Before : "+str3);
		str3=str3.toUpperCase();
		System.out.println("After : "+ str3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
