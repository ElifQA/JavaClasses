package com.class11;

public class LoopDemo {

	public static void main(String[] args) {
		
		//Create a 2D array of integer type with 3 rows and 4 columns and 
		//print all values of the whole array.
		int arr[][]= {
                {1,43,56,78},
                {23,45,65,76},
                {6,54,343,23,},
                
        };
        
        for (int arrays[]: arr) {
            for (int el: arrays) {
                
                System.out.print(el+" ");
            }System.out.println();
        }
		System.out.println("************");
        //second
		int [][] num= {
				{3,5,2,8},
				{4,9,1,4},
				{89,54,76,9}
		};
		
		for (int i=0; i<num.length; i++) {
			for (int j=0; j<num[i].length; j++ ) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("**********");
		
		//Create a 2D array or integer type where you will store odd and even numbers
		//in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.
		
			int [][] numbers= {
					{3,5,2,8},
					{4,9,1,4},
					{89,54,76,9}
			};
			for (int getnumbers[]:numbers) {
				for (int getCol:getnumbers) {
				if (getCol%2==0) {
					System.out.println(getCol+ " ");
				}
				}
				System.out.println();	
				
			}
			
		
		
		
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		//Print the sum of all numbers.
			int [][] number1= {
	                {3,5,6},
	                {4,7,9},
	                {7,8,5}
	        };
	        int sum=0;
	        
	        for (int getNum[]: number1) {
	            for(int getCol:getNum){
	                sum=sum+getCol;
	                
	            
	        }
	        System.out.println();
	        System.out.print(sum);
	        }
	        System.out.println("***************");
	      
	        //secondway
		int sum1=0;
		int [][] a= {
				{3,5,2,8},
				{4,9,1,4},
				{89,54,76,9},
		};
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++ ) {
				sum1=sum1+a[i][j];
				//System.out.print(num[i][j]+" ");
			}
			System.out.println();
			System.out.println(sum1);
		}
		System.out.println("*****************");
	}
	
            
        
        
    }
    
    
        
    

    
            
        
            
    


