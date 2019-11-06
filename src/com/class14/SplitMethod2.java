package com.class14;

public class SplitMethod2 {

	public static void main(String[] args) {
	

		
		
		
		
			String str="welcome to syntax technologies";
			String []array=str.split(" ", 3);
			System.out.println(array.length);
			
			for (int i=0; i<array.length; i++) {
				System.out.println(array[i]);
			}
	}

}
