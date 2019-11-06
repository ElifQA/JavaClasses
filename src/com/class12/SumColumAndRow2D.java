package com.class12;

public class SumColumAndRow2D {

	public static void main(String[] args) {
		//Write a program that will print the sum of all elements 
		//in column with index 1 in a 2-D int array. 
		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 } };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i][1];

		}

		System.out.println(sum);
		
		//Write a program that  takes a 2-D array and 
		//prints the sums of the each rows as an integer array.
		
		int[][] b = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
		
			for (int i=0; i<b.length; i++){
			  	int sum1=0;
			 for (int j=0; j<b[i].length; j++){
			    
			    sum1=sum1+b[i][j];
			}  
			
			  System.out.println(sum1);
			}
		System.out.println();	
			
	
	}

}
