package com.class10;

import java.util.Scanner;

public class ScannerArrayRepl {

	public static void main(String[] args) {
		//repl 78
		//Write an array with size of 5. 
		//Use a loop to input values to the array (don't print any prompt message for Scanner).
		//Then print out all the elements you have created in the first loop in reverse order. 
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = input.nextInt();
		}
		
		for (int i=arr.length-1; i>=0; i--)
		{
			System.out.println(arr[i]);	    

}
		
		
		int[] array=new int[5];
		for (int a=0; a<array.length; a++) {
		
		array[a] = input.nextInt();
		}
		for (int i=0; i<array.length; i++) {
			System.out.println(10*array[i]);	
		}
		
		
		
	      
	        
	      //repl 81
		    int [] number={45,78, 12,  67, 55, 89, 23, 77, 88};
		    int size1=number.length;
		    for(int i=1; i<size1; i+=3){
		    
		  
		    System.out.print(number[i]/i+" ");
		      } 
		    System.out.println();
		    //repl80
	        
	     //repl
			 char [] word1={'s','a','y','b','n','c','t','d','a','e','x'};
			    int size=word1.length;
			    for(int i=0; i<size; i+=2){
			      System.out.print(word1[i]);
			      
			    }
			    System.out.println();
			    //repl67
			    Scanner inp = new Scanner(System.in);
			    System.out.print("Int:");
			    int end = inp.nextInt();
			    for(int i=0;i<end*2;i++){
			        System.out.print(i+ " ");
			    }
			     
			    

	}}
