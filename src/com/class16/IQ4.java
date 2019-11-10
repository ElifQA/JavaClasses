package com.class16;

public class IQ4 {

	public static void main(String[] args) {
		String str="Today is very cold outside";
		String subString=str.substring(0, 5);
		System.out.println(subString);
		
		String []words=str.split(" " );
		System.out.println(words.length);

	}

}
