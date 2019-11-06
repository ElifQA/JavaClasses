package com.class12;

public class StringMinipulationDemo2 {

	public static void main(String[] args) {
	/*
	 * .contains
	 */
		String sentence="It was raining";
		String sen="raining";
		System.out.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("was"));
		
		
		//create two string and initialize them with some value.
		//implement the following methods on those strings.
		   /*
         * sen.length();
         * sen.equals();
         * sen.contains(s);
         * sen.toUpperCase();
         * sen.toLowerCase();
         * sen.equalsIgnoreCase(anotherString);
         */
        //task1
		String str="Java class";
		String str1="Today WE have a Java class";
		
		
		System.out.println(str.length());
		System.out.println(str1.length());
		
		
		System.out.println(str.equals(str1));
		System.out.println(str.contains("Java"));
		System.out.println(str1.contains("banana"));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(str.toUpperCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str1.toLowerCase());
        
        //this method if a string starts with the specified prefix beginning
         
     System.out.println("is this string start with ="+str1.startsWith("we"));
     
     //This method tests if this string ends with
     // the specified suffix.
     System.out.println("Is this string ends with = "+str1.endsWith("class"));
	}

}
