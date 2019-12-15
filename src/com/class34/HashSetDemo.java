package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//lets create a collection of veggies where I do not wan to have duplicates
				//hset order of the elements is not preserved
				HashSet<String> hset=new HashSet<>();
				//storing values into hashset
				hset.add("cucumber");
				hset.add("onion");
				hset.add("pepper");
				hset.add("zuccini");
				hset.add("carrot");
				hset.add("zuccini");
				hset.remove("onion");
				System.out.println(hset.size());
				System.out.println(hset);
				
				//they do not have any methods to retrieve elements from the collection
				//.get();, .set();
				
				//hw can we retrieve all elements?
				// iterator
				
				Iterator<String> it=hset.iterator();
				while(it.hasNext()) {
					String element=it.next();
					System.out.println(element);
				}
				System.out.println("-----------------");
				//enhanced for loop
				for(String el:hset) {
					System.out.println(el);
				}
			}

}
