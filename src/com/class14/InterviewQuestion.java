package com.class14;

public class InterviewQuestion {

	public static void main(String[] args) {
		// question1
		int x = 10;
		int y = 20;

		x = x + y;// 30
		y = x - y;// 10
		x = x - y;// 20
		System.out.println("after swaping:x=" + x + " y= " + y);

		System.out.println("********************");

		// question2 Write a java program to find
		// the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] array = { 2, 4, 5, 7, 1 };
		int secondLargest = array[0];
		int max = array[0];
		int min = array[0];

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max) {
				secondLargest = max;
				max = array[i];
			} else if (array[i] > secondLargest) {
				secondLargest = array[i];

			}
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		System.out.println("The second largest is " + secondLargest);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		// question 3// Find out how many alpha characters present in a string?
		String str2 = "heKL75jki8#";
		String st = str2.replaceAll("[^a-zA-Z]", "");

		System.out.println(st.length());
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		// question 4 How to find out the part of the string from a string?
		
		String str3 = "Today we have a Java class";

		System.out.println(str3.substring(16));
		System.out.println(str3.length());
		
		// What is substring? //substring is method returns a new string that is a
		// substring of this string.

		System.out.println("substring is a part of the string.");
		// Find number of words in string?
		String []ar=str3.split(" ");
		System.out.println(array.length);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&");
		
		// question 5
		String str = "Today is Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));

		}
	}
}
