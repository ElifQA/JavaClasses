package com.class11;

public class TaskArray {

	public static void main(String[] args) {
		//Create an array of cars and store 6 elements into it. 
		//Using 2 different loops print all values from the array.
		String [] cars= {"BMW", "mazda", "volvo","Ford","nissan","Tesla"};
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		String [] car= {"BMW", "mazda", "volvo","Ford","nissan","Tesla"};
		
		for (String car1:car) {
			System.out.println(car1);
		}
		System.out.println("********************");
		
		
		
		
		System.out.println("************");
		
		//Create an array on integers and calculate the sum of all elements in an array.
		int [] num= {4,5,9};
		int sum=0;
		for (int i=0; i<num.length; i++) {
			sum=sum+num[i];
			System.out.println(sum);
		}
		System.out.println("************");
		int [] number= {9,2,4};
		int sumA=0;
		for (int n:number) {
			sumA=sumA+n;
			System.out.println(sumA);
		}
		
			
		//Create an array of countries. While retrieving all values from an 
		//array print capital for each country. (use 2 different loops).
		String [] countries= {"Turkey", "USA","Germany"};
		for (String getCountry:countries ) {
			if (getCountry.equals("USA")) {
				System.out.println("The capital of USA is Washington");
			}else if (getCountry.equals("Turkey")) {
				System.out.println("The capital of turkey is Ankara");
			}else if(getCountry.equals("Germany")) {
				System.out.println("Berlin");
			}
		}
		
		
		
		
		}}
