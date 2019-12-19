package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class City {

	public static void main(String[] args) {
		String [] city= {"Ankara", "Bursa","Yalova", "Istanbul"};
		Map<String, Integer> map=new TreeMap<>();
		
		
		for (String c:city) {
			map.put(c, c.length());
		
			}
		System.out.println(map);
		 
		Iterator<Entry<String, Integer>> it=map.entrySet().iterator();
		while(it.hasNext()) {
			String key=it.next().getKey();
			if(key.length()>7) {
				it.remove();
				
			}}
			System.out.println(map);
		
	}

}
