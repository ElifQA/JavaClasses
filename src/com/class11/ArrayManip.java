package com.class11;

import java.util.Arrays;

public class ArrayManip {

	public static void main(String[] args) {
		int [] numbers= {123,34,55,66,99};
		for (int i:numbers) {
			System.out.println(i+" ");
		}
		
		System.out.println();
		
  
		Arrays.sort(numbers);
		for (int i:numbers) {
			System.out.println(i+" ");
		}
		int [][] array= { {7,6,9},{6,7,2,},{9,3,4}
		
		};
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(array[i][j]+" ");
			}
		}
		System.out.println();
		for (int []getrow:array) {
			for (int getcol:getrow) {
				System.out.print(getcol+" ");
			}
		}

	}

}
