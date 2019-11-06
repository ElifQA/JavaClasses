package com.class12;

public class Demo3IsEmpty {

	public static void main(String[] args) {
		/*This method checks whether a string is empty or not
		 * 
		 */
		
		String str="";
		System.out.println("Is this string empty= "+str.isEmpty());
		String str2="Hello";
		System.out.println("is this string empty "+str2.isEmpty());
		//type new line \n
		String sentence="Each day has a promise \n to brigten up the day,";
		System.out.println(sentence);
		
		System.out.println("*****************");
		/*this method appends
		 * 
		 */
		String str3="Hello ";
		String str4="World";
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		System.out.println("*************");
		
		/*this method
		 * 
		 */
		String str5=" How are you? ";
		System.out.println(str5.trim());
		
		/*
		 * 
		 */
		
		String str6="We might be done early today";
		System.out.println(str6.charAt(3));
		System.out.println("**************");
		/*
		 * 
		 */
		
		String str7="We might be done early today";
		System.out.println(str7.indexOf('m'));
		System.out.println(str7.indexOf('e',3 ));
		
		
		
		
		
		
		
		
		
		
	}

}
