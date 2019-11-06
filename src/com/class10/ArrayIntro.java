package com.class10;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int a;
		a=10;
		int a1=10;
		
		//1way
		int [] b;//declare an array---preferred way
		int c[];
		
		b=new int[4];//initialize
		//2 way all in one line declaration and initialization
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//access value from an array
		System.out.println(array[2]);
		
		//lets create an array taht will store classes
		String[] classes=new String[4];
		classes[0]="Java";
		classes[1]="Sdlc";
		classes[2]="Manual testing";
		classes[3]="GIT";
		System.out.println("today we have "+classes[0]+" class");
		
		int[] nums=new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		//how can change 1 to100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);//100+3
		
		//the size of an array is fixed
		String[] names=new String[3];
		names[0]="diana";
		names[1]="Seda";
		names[2]="jaime";
		//names[3]="Olga"; during run time we will get an exception 
		//ArrayIndexOutOfboundsException
		//System.out.println(names[3]);
		
		
		//we are putting less elements inside
		//compiler will give default values 0
		double [] numbers=new double[4];
		numbers[0]=0;
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[0]);
		
		int[] array1= {45,78,12,67,55};
		int size=array1.length;
		for (int i=0; i<size; i++)
		System.out.print(array1[i]);
		
		String[] cicek= {"rose","cactus","begonia"};
		int size2=cicek.length;
		for (int i=0; i<size2; i++) {
		System.out.println(cicek[i]);
		}
		
		int[] arr= {45,78,12,67,55,89,23,77,88};
		int siz1=arr.length;
		for (int i=0; i<siz1; i+=2) {
			System.out.println(arr[i]);
		}
		
		
				}
		
	}


