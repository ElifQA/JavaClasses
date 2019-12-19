package com.class35;

import java.util.*;

public class RetrieveAllKeys {

	public static void main(String[] args) {
		// Create a map of a person(name,lastName, address, city, state)

		Map<String, String> personMap = new LinkedHashMap<>();
		personMap.put("Name", "Ahmet");
		personMap.put("LastName", "Yildiz");
		personMap.put("Address", "123 Test");
		personMap.put("City", "Dallas");
		personMap.put("State", "TX");

		System.out.println(personMap);
		// how to retrieve a specific value?
		String value = personMap.get("State");
		System.out.println(value);
		//System.out.println(personMap.get("State"));

		// how to retrieve all keys and all values?
		Set<String> keys = personMap.keySet();

		System.out.println("-----Printing all keys using loop-------------");
		// how can I retrieve and print values key:value using for loop
		for (String key : keys) {
			//System.out.println(key + ":" + personMap.get(key)); key and values
			System.out.println(key);
		}

		System.out.println("-----Printing all keys using iterator-------------");
		// how can I retrieve and print values key:value using iterator
		Iterator<String> keysIterator = keys.iterator();
		while (keysIterator.hasNext()) {
			System.out.println(keysIterator.next());
			//System.out.println(keysIterator.next()+":"+ personMap.get(keysIterator.next())); //----giving error
			//String mapKey = keysIterator.next();
			//String mapValue = personMap.get(mapKey);

			//System.out.println(mapKey + "_" + mapValue);
		}
	}
}
