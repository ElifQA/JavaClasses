package com.class12;

public class FindMax2DArray {

	public static void main(String[] args) {
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
			int max=0;
			for (int i=0; i<a.length; i++){
			  for (int j=0; j<a.length; j++)
			  if( a[i][j] > max){
			    max=a[i][j];
			  }
			}
			System.out.println(max);

	}

}
