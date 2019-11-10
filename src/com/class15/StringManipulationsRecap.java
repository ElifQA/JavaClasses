package com.class15;

public class StringManipulationsRecap {

	public static void main(String[] args) {
		//String class comes in java lang package
		//string squence of character
		
		//2ways to create a string
		//first way String literal
		String str="Hello";
		//second way using new keyword creating a string object
		String str1=new String("Hello");
		
		//find number of characters inside the string
		int length=str.length();
		System.out.println(length);
		
		//case conversion methods/functions
        str=str.toLowerCase().toUpperCase();//HELLO
        System.out.println(str);//HELLO
        
        //verify if there if the string is Empty
        String myString="";//empty value
        boolean isEmpty=myString.isEmpty();
        System.out.println(isEmpty);
        
        String myString1=null;//no value at all it is equal to 
        // String myString1;
        //System.out.println(myString1.isEmpty());
        
        //how to verify existence of characters in the string
        String a="Good evening students";
        boolean exist=a.contains("student");
        System.out.println(exist);
        
        System.out.println(a.startsWith("Good"));
        System.out.println(a.endsWith("student"));
	}

}
