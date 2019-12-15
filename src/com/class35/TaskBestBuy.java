package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TaskBestBuy {

	public static void main(String[] args) {
		// Create a map of Best Buy store. Place item id and item name into it.
		//Example (7664847 = Printer, 7879885= TV etc )
		//●Retrieve all keys and values from a Best Buy map using EntrySet.

			Map<Integer, String> map=new HashMap<>();
			map.put(2365, "TV");
			map.put(5689,"Phone");
			map.put(5848, "Washer");
			map.put(8975, "Dryer");
			map.put(9658, "Irobot");
			System.out.println(map);
			
			Set<Entry<Integer, String>> entrySet=map.entrySet();
			System.out.println("_________using for each loop to get all entry objects");
			for (Entry<Integer, String >entry:entrySet) {
				System.out.println(entry.getKey()+"="+entry.getValue());
			}
			System.out.println("------using for iterator----");
			Iterator<Entry<Integer, String>> it=entrySet.iterator();
			while (it.hasNext()) {
				Entry<Integer, String> entry=it.next();
				Integer key=entry.getKey();
				String val=entry.getValue();
				System.out.println(key+" : "+val);
			}
			
			
	}

}
