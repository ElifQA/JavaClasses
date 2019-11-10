package com.class15;

public class StringCharAtMore {

	public static void main(String[] args) {
		 //get a character at specific location
        String str="Syntax Technologies Inc";
        
        char letter=str.charAt(5);
        System.out.println(letter);
        //length =19
        //System.out.println(str.charAt(str.length()));//StringIndexOutOfBoundsException
        System.out.println(str.charAt(str.length()-1));
        
        //get a substring from a String
        //Syntax
        String substr1=str.substring(0, 6);
        System.out.println(substr1);
        //Technologies Inc
        String substr2=str.substring(7);
        System.out.println(substr2);
        
        
      //replace
        String str1="Java classes at Syntax are awesome";
        str1=str1.replace("awesome", "great");
        System.out.println(str1);
        str1=str1.replace("a", "1234  68%&&  %%%");
        System.out.println(str1);
        
        //replaceAll --> specify regular expression
        //lets remove all special characters
        str1=str1.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(str1);
        
        //split
        String myString="Java classes at Syntax are awesome";
        String[] array=myString.split("a");
        System.out.println(array.length);
	}
	

}
