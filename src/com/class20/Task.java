package com.class20;

public class Task {
	/* Create a method that will take 1 parameter as a String and return reversed String. 
	 * Method should be visibly only within same package.--->use default
	 */
	String rev(String word) {
    	String reversed="";
    	
    	for (int i=word.length()-1; i>=0; i--) {
    		reversed=reversed+word.charAt(i);
    	}
    	return reversed;
    }
public static void main(String[] args) {
		
		Task obj=new Task();
		String result=obj.rev("today Java class");
		System.out.println(result);
	}
	

 	

    
    

	

}
