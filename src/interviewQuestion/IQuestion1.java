package interviewQuestion;

import java.util.Arrays;

public class IQuestion1 {

	public static void main(String[] args) {
		// question1Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?
		int x = 10;
		int y = 20;

		x = x + y;// 30
		y = x - y;// 10
		x = x - y;// 20
		System.out.println("after swaping:x=" + x + " y= " + y);
		
		String s1="Hello";
        String s2="Welcome";
        
        s1=s1+s2;
        
        s2=s1.replaceAll(s2,  "");
        s1=s1.replaceAll(s2, "");
        
        System.out.println(s1);
        System.out.println(s2);
		System.out.println("********************");

		// question2 Write a java program to find
		// the second largest number in the array?
		// Maximum and minimum number in the array?

		int[] array = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		Arrays.sort(array);
		int smalest=array[0];
		int largest=array[array.length-1];
		
		System.out.println(smalest);
		System.out.println(largest);
		System.out.println("*************");
		//secondway
		int[] myarray = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		int secondLargest = array[0];
		int max = myarray[0];
		int min = myarray[0];

		for (int i = 0; i < myarray.length; i++) {

			if (myarray[i] > max) {
				//secondLargest = max;
				max = myarray[i];
			
		}else if (myarray[i]>secondLargest) {
            secondLargest = myarray[i];
		}if (myarray[i] < min)
				min = myarray[i];

		}
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
		System.out.println("The second largest is " + secondLargest);
		System.out.println("***********************");
		
		// question 3// Find out how many alpha characters present in a string?
		String str2 = "heKL75jki8#";
		String st = str2.replaceAll("[^a-zA-Z]", "");

		System.out.println(st.length());
		System.out.println("***********************");

		// question 4 How to find out the part of the string from a string?

		String str3 = "Today we have a Java class";

		System.out.println(str3.substring(16));
		System.out.println(str3.length());

		// What is substring? //substring is method returns a new string that is a
		// substring of this string.

		System.out.println("substring is a part of the string.");
		// Find number of words in string?

		String[] ar = str3.split(" ");
		System.out.println(ar.length);

		System.out.println("**********************");

		// question 5Write a java program to reverse String?
		// Reverse a string word by word?

		String str = "Today is Sunday";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			// System.out.println("**********************");

		}

		int []myarr= {55,89,62,5,6,1};
		
		
		

	}

}
