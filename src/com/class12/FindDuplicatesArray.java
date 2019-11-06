package com.class12;

public class FindDuplicatesArray {

	public static void main(String[] args) {
		int [] array= {2,5,4,7,2};
		for (int i = 0; i < array.length; i++) {
			//System.out.println(array[i]);
			for (int j=i+1; j<array.length; j++) {
				if (array[i]==array[j]) {
					System.out.println(array[j]);
				}
			}
		}
		

	}

}
