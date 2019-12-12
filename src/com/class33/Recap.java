package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class Recap {

	public static void main(String[] args) {
	ArrayList<Integer> numbers=new ArrayList<>();
	numbers.add(1);
	numbers.add(10);
	numbers.add(100);
	numbers.add(1000);//index 3 size 4
	
	int size=numbers.size();
	System.out.println(size);//4
	//add more
	numbers.add(10000);
	//remove
	numbers.remove(size-1);//3
	numbers.removeAll(numbers);
	System.out.println(numbers);

	//retrieve value from an arrayList
	int element=numbers.get(0);
	System.out.println(element);
	
	//for loop
	for (int i=0; i<numbers.size(); i++) {
	System.out.println(numbers.get(i));
	}
	//advanced loop
	for (int num:numbers) {
		System.out.println(num);
	}
	//i want to get values backward
	for (int i =numbers.size()-1; i>=0; i--) {
		System.out.println(numbers.get(i));
	}
	System.out.println("________________");
	//3 using Iterator
	Iterator <Integer>iterator=numbers.iterator();
	
	while (iterator.hasNext()) {
		int number=iterator.next();//autoboxing
		//System.out.println(iterator.next());
		//if (number)
	}
	
	
		
	
	
	
	
	
	
	}

}
