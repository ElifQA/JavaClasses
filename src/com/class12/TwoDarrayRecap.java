package com.class12;

public class TwoDarrayRecap {

	public static void main(String[] args) {
		int [][]array=new int [2][3];
		//first row
		array[0][0]=9;
		array[0][1]=10;
		array[0][2]=11;
		
		array[1][0]=9;
		array[1][1]=10;
		array[1][2]=11;
		
		for (int i []: array) {
			for (int j:i) {
				System.out.println(j);
			}
			
		}
		System.out.println("*************");
		int [][]array1= {
				{44,56,1}, {55,21,5}
		};
		for (int[] getarr:array1) {
			for (int j:getarr) {
				System.out.println(j);
			}
		}
		
	}

}
