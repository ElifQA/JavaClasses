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
		

	}

}
