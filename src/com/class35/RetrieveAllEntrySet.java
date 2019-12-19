package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class RetrieveAllEntrySet {

	public static void main(String[] args) {
		// lets create a map of a classroom  in which we will store objects and it's quantities
		
		Map<String , Integer> classRoom=new HashMap<>();
		classRoom.put("Insrtuctor", 3);
		classRoom.put("Student", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);
		System.out.println(classRoom);
		
		Set<Entry<String, Integer>> entrySet= classRoom.entrySet();
		
		System.out.println("_________using for each loop to get all entry objects");
		for (Entry <String , Integer>entry :entrySet) {
			System.out.println(entry.getKey()+" :"+entry.getValue());
			
			}
		
		System.out.println("_________using iterator to get all entry objects");
		Iterator<Entry<String, Integer>>entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String,Integer> ent=entryIterator.next();
			String entry=ent.getKey()+"---"+ent.getValue();
			System.out.println(entry);
			
			}
		Set<Entry<String, Integer>> ent=classRoom.entrySet();
		Iterator<Entry<String, Integer>> it2=ent.iterator();
		while(it2.hasNext()) {
			Entry<String, Integer> entry=it2.next();
			String key=entry.getKey();
			Integer val=entry.getValue();
			System.out.println(key+" "+val);
			
		}
	}

}
