package com.class36;
import java.util.*;
	import java.util.HashMap;
import java.util.Map.Entry;
class Repl203{ 
	//Print all the values using loop and KeySet
	 
	public static void main(String[]args) {
	  HashMap<String, String> map = new HashMap<String, String>();
	         
	        map.put("Street", "Patrick ST");
	        map.put("Suite", "265");
	        map.put("City", "Vienna");
	        map.put("Zip", "22180"); 
	        map.put("Country" , "United State");
	        
	        for (String keys : map.keySet()){
	          System.out.println(map.get(keys));
	        }
	        //repl204 Print all the values using entrySet in upper case. 
	        HashMap<String,String > map1= new HashMap<>();
	        map.put("Street", "Patrick ST");
	  	        map.put("Suite", "265");
	  	        map.put("City", "Vienna");
	  	        map.put("Zip", "22180"); 
	  	        map.put("Country" , "United State");
	  	       
	  	       // System.out.println(map);
	  	      Set<Entry<String, String>> setEntry = map.entrySet();
	  		
	  	  	for (Entry<String, String> entry : setEntry) {
	  		  	String values = map.get(entry.getKey()).toUpperCase();
	  		  	System.out.println(values);
	  	  	} 
	  	  	//repl 205 Print all keys using iterator
	  	  Set<String> keys=map.keySet();
	         Iterator<String> it=keys.iterator();
	         while(it.hasNext()){
	           System.out.println(it.next());
	         }
	         //repl 207
	         
	         Map<String, String> map2=new HashMap<>();
	         map2.put("ONE","AAA");
	     map2.put("TWO","BBB");
	     map2.put("THREE","CCC");
	     map2.put("FOUR","DDD");
	     map2.put("FIVE","EEE");
	       System.out.println("HashMap Before Remove :");
	       
	       Set<String> key=map2.keySet();//get all values and keys
	      
	       for (String k:key){
	         System.out.println(k+" : "+map2.get(k));
	       }
	         map2.remove("FOUR","DDD");
	         map2.remove("ONE","AAA");
	         System.out.println("---------------------");
	         
	         System.out.println("HashMap After Remove :");
	         //Set<String> keyset=map2.keySet();
	       for (String k:key){
	         System.out.println(k+" : "+map2.get(k));
	       }
	       
	       
	       Set<Entry<String,String>> ent=map2.entrySet();

	       Iterator<Entry<String,String>> it1=ent.iterator();
	       while(it.hasNext()){
	         Entry<String, String> entry=it1.next();
	          String en=entry.getKey();
	         String e=entry.getValue();
	         System.out.println(en +e );
	       }

	       Set <Map.Entry<String, String>> keyValueSet=map.entrySet();
	    	Iterator <Map.Entry<String, String>>it2=keyValueSet.iterator();
	    	while(it.hasNext()) {
				  Map.Entry entry = it2.next();
				  String entryValue=entry.getKey()+" : "+entry.getValue();
				  System.out.println(entryValue);
			  }
	                 
	        System.out.println("------------------");
	       }
	
	      }
	    
	     
	        
	  
	

