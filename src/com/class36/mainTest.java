package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class mainTest{
	public static void main(String[]args){
		Map<String, Integer> map=new TreeMap<>();
		map.put("Elif", 25);
		map.put("Ayse", 32);
		map.put("Zeliha", 41);
		map.put("Melos", 40);
		
		Set<String> key=map.keySet();
		for(String keyset:key) {
			System.out.println(keyset+" "+map.get(keyset));
		}
		Collection<Integer> col=map.values();
		for (Integer values:col) {
			System.out.println(values);
			}
		Iterator<Integer> it=col.iterator();
		while(it.hasNext()) {
			Integer i=it.next();
			System.out.println(i);
		}
		Set<Entry<String, Integer>> ent=map.entrySet();
		for(Entry<String,Integer> entry:ent) {
			System.out.println(entry);
		}
		Iterator<Entry<String, Integer> >itkey=ent.iterator();
		while (itkey.hasNext()){
			Entry<String, Integer> getkey=itkey.next();
			String s=getkey.getKey()+" "+getkey.getValue();
			System.out.println(s);
			
			{
		}
			
		}
		
		
		String name="Tim my";
		int i=10;
	    System.out.println(name.length());
	    System.out.println(name.indexOf("m")+" "+name.indexOf(" "));
		
		
		
		
		
		}}	