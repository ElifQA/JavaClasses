package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class HomeWork {

	public static void main(String[] args) {
		//create an array list of cars and retrieve all the 
		//value using 3 different ways
		
		ArrayList<String>cars=new ArrayList<>();
		cars.add("BMW");
		cars.add("Nissan");
		cars.add("Tesla");
		System.out.println(cars.isEmpty());
		
		for (int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		for(String str:cars) {
			System.out.println(str);
		}
		Iterator<String> it=cars.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
}}
