package com.class12;

import java.util.Scanner;

public class scannerP {

	public static void main(String[] args) {
	
		
		int []arr=new int [3];
		Scanner scan=new Scanner(System.in);
		
		for (int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
			System.out.println(arr[i]);
		}
		System.out.println("**************");
		
		   
		
			
		   //repl 102Print out the first three letters of each element of array, one per line.  

		   Scanner input = new Scanner(System.in);
			String[] ar = new String[5];
			for (int i=0;i<5;i++)
			{
				ar[i] = input.nextLine();
		
			System.out.println(ar[i].substring(0,3));
			
			
			//repl103Write a for loop that will loop through every character 
			//of a word and print out each character, each on a separate line 

			Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    
		    char [] a=word.toCharArray();
		    for (int b=0; b<a.length; b++){
		    System.out.println(a[b]);
		    
		    //secodway
		    Scanner inpt = new Scanner(System.in);
		    System.out.print("In:");
		    String word1 = inpt.nextLine();
		    
		  for(int i1=0;i1<=word1.length()-1;i1++){
		      System.out.println(word1.charAt(i1));
		    }
		    }
	  
			}
			//repl104Write a for loop that will print out every other letter in a String, 
			//starting with the first letter.  These letters should be printed all on one line with no space in between.

			Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String word = inp.nextLine();
		    //write your code below
		    for(int i=0;i<=word.length()-1;i++){
			      System.out.print(word.charAt(i++));
			    }
			
		     
	}

}
