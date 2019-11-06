package com.class12;

public class SingleArrayRecap {

	public static void main(String[] args) {

		int[] array = new int[4];   //int [] array1= {2,5,8,7};
		array[0] = 12;
		array[1] = 13;
		array[2] = 14;
		array[3] = 14;
		int sum=0;
		for (int i = 0; i <array.length; i++) {
			//if (i%2==0) {
			sum=sum+array[i];
			System.out.println(array[i]);
		}
		System.out.println(sum);
		System.out.println("*****************");
		//second way
		for (int get : array) {
			System.out.println(get);

		}
	}
}
