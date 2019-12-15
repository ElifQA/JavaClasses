package com.class34;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorUsage {

	public static void main(String[] args) {
		List<String>stringList=new ArrayList<>();
		stringList.add("Esra");
		stringList.add("Hasan");
		stringList.add("Ali");
		stringList.add("Salim");
		stringList.add("Ak");
		
		//removes names that are shorter than 4 character
		stringList.remove(2);
		System.out.println(stringList);
		//removing lement using for loop
		for (int i=0; i<stringList.size(); i++) {
			if (stringList.get(i).length()<=4) {
				stringList.remove(i);
			}
		}
		System.out.println(stringList);
		
		//best way to remove an element from a collection  --iterator
		List<String>stringList1=new ArrayList<>();
		stringList1.add("Esra");
		stringList1.add("Hasan");
		stringList1.add("Ali");
		stringList1.add("Salim");
		stringList1.add("Ak");
		
		
		Iterator<String>it= stringList1.iterator();
		while (it.hasNext()) {
			if(it.next().length()<4) {
				it.remove();
			}
		}
		System.out.println(stringList1);
		
	}

}
