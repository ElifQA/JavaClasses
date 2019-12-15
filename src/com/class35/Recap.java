package com.class35;

import java.util.*;

public class Recap {
	public static void main(String[] args) {
		Set<Double> set=new LinkedHashSet<>();
		set.add(99.99);
		set.add(90.99);
		set.add(59.99);
		set.add(39.99);
		set.add(19.99);

		Iterator<Double> iterator=set.iterator();
		while(iterator.hasNext()){
			double d=iterator.next();
			if(d<50) {
				iterator.remove();
			}
		}

		for(Double d1:set){
			System.out.println(d1);
		}
		/////////////////////////////////////////////
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

		Set<String> hset=new HashSet<>();
		hset.addAll(aList);
		System.out.println(hset);
		
		aList.clear();
		System.out.println(aList);
		aList.addAll(hset);
		System.out.println(aList);
		///////////////////////////////////
		//How  can I access/update just 1 value from the Set collection
	
		Set<String> lset=new LinkedHashSet<>();//keep the order
		lset.add("Morning");
		lset.add("Noon");
		lset.add("Evening");
		lset.add("Night");
		
		//convert to the ArrayList
		List<String> myList=new ArrayList<>();
		myList.addAll(lset);
		String element=myList.get(2);
		System.out.println(element);
		
		//another way to create an Object of ArrayList by passing values to the constructor
		List<String> myList1 = new ArrayList<>(lset);
		
	}
}