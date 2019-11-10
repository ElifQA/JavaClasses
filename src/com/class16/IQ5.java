package com.class16;

public class IQ5 {

	public static void main(String[] args) {
		//reverse string
		String given="Welcome to the Java class";
		
		for (int i=given.length()-1; i>=0; i--) {
			System.out.print(given.charAt(i));
		}
		 System.out.println("using toCharArray");
	        String str = "I love Java!";
	        char[] newStr = str.toCharArray();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            System.out.print(newStr[i]);
	        }
		System.out.println();
		//reverse word by word
		String reversedWords = "";
        String[] words = given.split("\\s");
        for(int i = words.length-1; i>=0; i--) {
            reversedWords = reversedWords + words[i] + " ";
        }
        System.out.print(reversedWords);
        
       
	}

}
