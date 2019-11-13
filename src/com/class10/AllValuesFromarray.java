package com.class10;

public class AllValuesFromarray {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','C','D','E','F'};
		
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		
		a+=2;//2+2
		System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		System.out.println("--------------------");
		
		
		
		String[] animals= {"cat", "dog", "cow","snake","elephant"};
		int size=animals.length;
		
		for(int i=0; i<size; i++) {
			System.out.print(animals[i]+" ");
		}
			
			//create an array to store 5 double values print all elements in 1 line
			double[] numbers= {1.2,4.5,3.6,8.2,9.0};
			int size1=numbers.length;
			
			for (int i=0; i<size1; i++) {
				System.out.println(numbers[i]);
				
			}
					
			
			}
			}		

	