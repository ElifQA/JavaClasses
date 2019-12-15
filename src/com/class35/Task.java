package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		HashMap <Integer, String> map=new HashMap<>();
		map.put(2, "General");
		map.put(3,"Synax");
		map.put(4, "Google");
		map.put(2, "General");
		map.put(5, "Synax");
		map.put(6, "Apple");
		map.put(7, "LG ");
		System.out.println(map);
		
		System.out.println(map.size());
		map.replace(4, "Nokia");
		System.out.println(map);
		map.remove(7);
		
System.out.println(map);
	}

}
