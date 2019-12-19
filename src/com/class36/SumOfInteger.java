package com.class36;

import java.util.LinkedList;
import java.util.List;

public class SumOfInteger {
	//Create a collection of integers in which you can keep duplicates. 
	//Write a logic to find sum of all integers

	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<>();
		list.add(4);
		list.add(6);
		list.add(3);
		list.add(5);
		
		int sum=0;
		for(Integer s:list) {
			sum+=s;
		}
		System.out.println(list);
		System.out.println(sum);
	}

}
