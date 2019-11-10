package com.class14;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 */

		String str = "Today is Sunday.";

		System.out.println(str.replaceAll(" ", ""));
		System.out.println("********************");

		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many alpha characters are there in the String.
		 */
		String str2 = "hel2780@#%jfkf%^1";
		String st = str2.replaceAll("[^a-z]", "");

		System.out.println(st.length());

		/*
		 * You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class
		 * today?” How would you find out how many sentences are in that String?
		 */

		String str3 = "Is it saturday? Is. it. raining? Do we have a Java Class today?";

		String[] array = str3.split("\\?");
		System.out.println(array.length);
		
		int []marray= {69,5,8,9,74,};
		
		String x="hello";
		String y="bye";
		
		x=x+y;
		y=x.substring(0,5);
		x=x.substring(5);
		System.out.println(x);
		System.out.println(y);
		
		String st1="ke98&^%$#lk)";
		String st2=st1.replaceAll("[^a-z0-9]", "");
		System.out.println(st2);
		
		String st3="tomorrow i have a java class";
		for (int i=st3.length()-1; i>=0; i--) {
			System.out.print(st3.charAt(i));
			
		}

	}

}
