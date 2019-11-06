package com.class14;

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

		String str3 = "Is it saturday? Is it raining? Do we have a Java Class today?";

		String[] array = str3.split("\\?");
		System.out.println(array.length);

	}

}
