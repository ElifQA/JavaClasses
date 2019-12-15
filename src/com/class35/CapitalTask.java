package com.class35;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CapitalTask {

	public static void main(String[] args) {
		Map<String , String > map=new TreeMap<>();
		map.put("Turkey", "Ankara");
		map.put("USA", "Washington Dc");
		map.put("Germany", "Berlin");
		
		Set<String > keys=map.keySet();
		System.out.println(map);
		System.out.println("_____________for each loop");
		for (String key:keys) {
			System.out.println(key+":"+map.get(key));
			
}
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String mapkeys=it.next();
			String mapValues=map.get(mapkeys);
			System.out.println(mapkeys+" "+mapValues);
		}
		
		Collection<String > val=map.values();
		//each loop for get key
		System.out.println("__________each loop");
		for (String v:val) {
			System.out.println(v);
		}
		System.out.println("-----Printing all keys using iterator-------------");
		System.out.println("______________iterator");
		Iterator<String > vIt=val.iterator();
		while(vIt.hasNext()) {
			System.out.println(vIt.next());
		}

}}
