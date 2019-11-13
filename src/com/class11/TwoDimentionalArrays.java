package com.class11;

public class TwoDimentionalArrays {

	public static void main(String[] args) {
		// Declare 2D array
        int[][] array=new int[3][4];
// create 1st row;        
        array[0][0]=44;
        array[0][1]=80;
        array[0][2]=33;
        array[0][3]=20;
// create 2nd row;
        
        array[1][0]=10;
        array[1][1]=5;
        array[1][2]=7;
        array[1][3]=8;
        
// 3rd row:
        array[2][0]=10;
        array[2][1]=9;
        array[2][2]=70;
        array[2][3]=6;
        
        System.out.println(array[1][3]);
        
        //task crate 2D array of string with 2 and 3 columns.
        int [] [] arr=new int[2][3];
        arr[0][0]=7;
        arr[0][1]=5;
        arr[0][2]=4;
        
        arr[1][0]=6;
        arr[1][1]=9;
        arr[1][2]=3;
        System.out.println(arr[1][2]);
        
        String[][]  arra=new String[2][3];
        arra[0][0]="ali";
        arra[0][1]="veli";
        arra[0][2]="ahmet";
        
        arra[1][0]="saban";
        arra[1][1]="recep";
        arra[1][2]="ramazan";
        System.out.println(arra[1][2]);
        System.out.println("**********");
       
        
        
        //second way
        int [][] number= {
        		{8,7,9,0,5},
        		{4,5,2,6,1,9},
        		{3,2,1,7},
        };
        System.out.println("the value in index 1 and 4 is =" +number[1][4]);
       
        //To identify the numbers of Rows
        System.out.println("The numbers of Rows are:= " + number.length);
        
        //To identify the numbers of Columns/elements in that row
        System.out.println("The numbers of columns are:= " +number[0].length);
        System.out.println("**********************");
        
        for (int a=0; a<number.length; a++){        			
        	for (int j=0; j<number[a].length;j++) {        			
        		System.out.print(number[a][j]+" ");
        		}
        	System.out.println();
        	}
        for (int getnumber[]:number) {
        	for (int getcol:getnumber) {
        		System.out.print(getcol+" ");
        	}
        	System.out.println();
        }
        }
	}


