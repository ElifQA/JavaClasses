package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		/*split()
		 * this method splits this string around matches of 
		 * the given regular expression.
		 */
		String str="Video provides a powerful way to help you "
				+ "prove your point.";
			String []array=str.split(" ");
			for (int i=0;i<array.length; i++) {
				System.out.print(array.length);
			}
			System.out.println();
			//how many sentence 
			String str1="Today is sunday. Its sunny day. and we are having java class.";
			String [] array2=str1.split("\\.");
			System.out.println("The number of sentences in the given string is : "+array2.length);
			
			//for (String string:array) {
				//System.out.println(string);
			//}
			
	}

}
