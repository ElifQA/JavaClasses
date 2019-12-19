package com.class36;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class employeeTask {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("Ali", 65000000);
		map.put("Veli", 560000000);
		map.put("Ahmet", 800000 );
		map.put("Eda",900000);	
		
		System.out.println(map);
		Collection<Integer> salary=map.values();
		int max=0;
		for (Integer key:salary) {
			if(key>max) {
				max=key;
			}
			
		}
		Set<Entry<String, Integer>> key=map.entrySet();
		for(Entry<String, Integer> k:key) {
			if(k.getValue()==max) {
				System.out.println(k);
			}
		}
		
		 Map<String, Integer> empMap=new HashMap<>();
	        empMap.put("Anna", 5600);
	        empMap.put("Sara", 7300);
	        empMap.put("Hana", 3500);
	        empMap.put("Lara", 4300);
	        empMap.put("Tara", 8700);
	        
	       Collection<Integer> val=empMap.values();
	       int mx=0;
	       for(Integer value:val) {
	    	   if(value>mx) {
	    		   mx=value;
	    	   }
	       }
	       Set<Entry<String, Integer>> ent=empMap.entrySet();
	       for(Entry<String,Integer> entry:ent) {
	    	   if(entry.getValue()==mx) {
	    		   System.out.println(entry);
	    	   }
	       }
	        }
		}
	

