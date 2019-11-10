package interviewQuestion;

import java.util.Arrays;

public class Part1 {

	public static void main(String[] args) {
		// question1 Write a program to swap 2 numbers without a temporary variable?
		// Swap 2 strings without a temporary variable?
		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("The value of a= " + a);
		System.out.println("The value of b= " + b);
		
		String str1="Hello";
		String str2="Welcome";//7
		 
		 str1=str1+str2;//HelloWelcome--> 12
		 //str2=str1.substring(0, str1.length()-str2.length());//Hello
		 //str1=str1.substring(str2.length());
		 str2=str1.substring(0, 5);
		 str1=str1.substring(5);
		 
		 System.out.println("The value of str1="+str1);
		 System.out.println("The value of str2="+str2);
		
		 // question2 Write a java program to find
		// the second largest number in the array?
		// Maximum and minimum number in the array?
		int[] array = {  5, 23, 6, 2, 67,1, 33, 23, 3, 88, 48 };
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length - 1];

		System.out.println(min);
		System.out.println(max);

		int[] myarray = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
		int largest=myarray[0];
		int secondlargest=myarray[0];
		int smalest=myarray[0];
		
		for (int i=0; i<myarray.length; i++) {
			if (myarray[i]>largest) {
				largest=myarray[i];
				
			}else if( myarray[i]>secondlargest) {
				secondlargest=myarray[i];
			}
			if (myarray[i]<smalest) 
				smalest=myarray[i];
		}
			System.out.println(largest);
			System.out.println(secondlargest);
			System.out.println(smalest);
		
	}

}
