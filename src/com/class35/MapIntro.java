package com.class35;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		HashMap <Integer, String> map=new HashMap<>();
		//to store key+value pair into map
		map.put(101, "John");
		map.put(102, "Jack");
		map.put(103, "Jane");
		map.put(104, "Jenny");
		System.out.println(map);
		
		//how to verify if there any elements inside map
		boolean flag=map.isEmpty();
		if (!flag) {
			int size=map.size();
			System.out.println(size);
			
		}
		//i want to add more entry objects
		//adding duplicate values ---ok
		map.put(105, "John");
		System.out.println(map);
		//adding duplicate keys ---override , we cant have duplicate keys
		//value will be replace
		map.put(102, "Hasan");
		System.out.println(map);
		
		//how to access a value
		String mapElement=map.get(105);
		System.out.println(mapElement);
		//to replace or update the value
		map.replace(103, "Zeynep");
		System.out.println(map);
		//how to remove an object from a map
		map.remove(101);
		System.out.println(map);
		
		//how to verify if certain key is exist 
		boolean flag1=map.containsKey(200);
		System.out.println(flag1);
		if (flag1 ) {
			map.replace(200, "Seval");
		}else {
			map.put(200, "Seval");
		}
		//how to verify if certain values is exist
		boolean contains=map.containsValue("Seval");
		System.out.println(contains);
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}
