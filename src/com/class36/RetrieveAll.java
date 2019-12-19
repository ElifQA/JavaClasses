package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetrieveAll {

	public static void main(String[] args) {
		Map<String, Integer> groceryMap = new LinkedHashMap<>();
		groceryMap.put("Milk", 2);
		groceryMap.put("Tea", 3);
		groceryMap.put("Onion", 5);
		groceryMap.put("Apple", 10);

		// retrieve single value
		groceryMap.get("Apple");

		// verify if specific key or value is in the map
		groceryMap.containsKey("Milk");
		groceryMap.containsValue(2);

		// how to retrieve all values?

		Collection<Integer> values = groceryMap.values();
		for (Integer val : values) {
			System.out.println(val);
		}

		Iterator<Integer> valIt = values.iterator();

		while (valIt.hasNext()) {
			System.out.println(valIt.next());
		}

		// get all keys and map them to values (milk --> 2)
		//Set<String> keys = groceryMap.keySet();
		for (String k : groceryMap.keySet()) {
			System.out.println(k.toUpperCase() + "-->" + groceryMap.get(k));
		}
		System.out.println("---------------------------");
		Iterator<String> keyIterator=groceryMap.keySet().iterator();
		while(keyIterator.hasNext()) {
			String itKey=keyIterator.next();
			Integer val=groceryMap.get(itKey);
			System.out.println(itKey.toLowerCase()+"-->"+val);
		}
		
		// get all keys and map them to values (milk --> 2) using entrySet
		Set<Entry<String, Integer>> entr=groceryMap.entrySet();
		for(Entry<String, Integer> e:entr) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
		
	}
}
