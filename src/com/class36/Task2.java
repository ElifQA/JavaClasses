package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//Create a Map from array of cities that will sort keys in alphabetical order. 
//As a key store the name of the city and as a value store the length of the city 
//(Example: Paris=5, Moscow =6, Washington DC=13 etc..). 

	//If any city name is more than 7 characters remove that city ( use Iterator ). 
	

public class Task2 {
	public static void main(String[] args) {
		
	Map<String, Integer> city=new TreeMap<>();
	city.put("Paris", 5);
	city.put("Moscow", 6);
	city.put("Berlin",6);
	city.put( "Washington DC",13);
	
	Set<Entry <String, Integer>> ent=city.entrySet();
	
	Iterator <Entry<String, Integer>> it=ent.iterator();
	while(it.hasNext()) {
		String key=it.next().getKey();
		if (key.length()>7) {
			it.remove();
		}}
		System.out.println(city);
		
		}}

