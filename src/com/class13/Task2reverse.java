package com.class13;

public class Task2reverse {

	public static void main(String[] args) {
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		String str="Sunday";
		
		for (int i=str.length()-1; i>=0; i--) {
			//for(int i=5; i>=0; i--) {	
		
		System.out.print(str.charAt(i));
		}
		System.out.println("***************************");	
	//Create a String and if the String is not empty perform the following:		
	//if the String has an odd number of characters and has 3 or more characters,
	   //print the character in the middle of the String.
			String sen1="merhaba";
			if (! sen1.isEmpty()) {
				if (sen1.length() % 2!=0 && sen1.length()>=3) {
					System.out.println(sen1.charAt(sen1.length()/2));
					
				}
			}
		
		
		
		
			String str1="Hello";
			//int middle=str1.length()/2;
			if (!str1.isEmpty()) {
				if(str1.length() %2!=0 && str1.length()>=3 ) {
					//System.out.print(str1.charAt(middle));
					System.out.println(str.charAt(str1.length()/2));
					
				}
					
				}
			String sen="bugun gunlerden cumartesi";
			System.out.println(sen.length());
				for (int i=24; i>=0; i--) {
			//for (int i=sen.length()-1; i>=0; i--) {
				System.out.print(sen.charAt(i));
			}
				
			}

	}


