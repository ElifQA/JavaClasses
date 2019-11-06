package com.class10;

public class PracticeTask {

	public static void main(String[] args) {
	
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);
		//task second way
		 char[] grades1 = {'A', 'B', 'C', 'D', 'E', 'F'};
		 System.out.println(grades1[1]);
		 
		 //task2/*create an array of names and store all names of your group.
         //* then print your name from that array. (use 2 different ways
         //* of creating an aray)
		 
		 String[] names= {"Mike","Ali","July","Elif"};
		 System.out.println(names[3]);
		 
		 
		 //task3
		 /*create an array of words: Java, Saturday,day,coding, is.
	         * Print the following sentence using element of array:
	         * "Saturday is Java coding Day"
	         */
		 String[] words=new String[5];
		 words[0]="Java ";
		 words[1]="Saturday ";
		 words[2]="day.";
		 words[3]="coding ";
		 words[4]="is ";
		 
		 System.out.println(words[1]+ words[4]+ words[0]+ words[3]+ words[2]);
		 //second way
		 String[] word={"Java ","Saturday ","day.","coding ","is "};
		 System.out.println(word[1]+word[4]+word[0]+word[3]+word[2]);
		
		 
		    System.out.println();
		    //Hw task
		//Create an array on integers and calculate the sum of all elements in an array.
		   int[] number = {6,5,9,2,4}; 
		   
		   int sum=0;
		  for (int i=0; i<number.length; i++) {
			  sum=sum+number[i];
			   System.out.println(sum);
			   
		   }
		  String[] cars = {"Volvo", "BMW", "Ford"};
		  for
		   (String i : 
		  cars
		  ) {
		    System.out.println(i);
		  }
		  
		  int [] arr= {2010,2011,2012,2013,2014};
		  for (int i=0; i<arr.length; i++) {
			  System.out.println(arr[i]);
		  }
		  }
}    
	


