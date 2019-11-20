package com.class20;

public class Task3 {
	/*Create a method that will take a string and 
	 * return an array of words from that string.
	 * Method should be available only within same class.----use private
	 */
	
	private String [] arrayOfWords(String sentence) {
		//String [] stringArray;
		//stringArray=sentence.split(" ");
		//return stringArray;
		
	return sentence.split(" ");
	}
	public static void main(String[] args) {
	Task3 obj=new Task3();
	String [] str1=obj.arrayOfWords("What a beautiful day ");
	for(String getArray:str1) {
		System.out.println(getArray);
		//for (int i=0; i<str1.length; i++){
		//System.out.println(str1[i]);
		
	}
	}

}
