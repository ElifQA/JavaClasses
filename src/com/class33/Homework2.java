package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework2 {

	public static void main(String[] args) {
	
		//create arrayList of words 
		//remove every word taht ends with "e" use iterator 
		List<String>list=new ArrayList<>();
		
		list.add("Hello");
		list.add("Hi");
		list.add("Love");
		
		Iterator <String >it=list.iterator();
		
		while(it.hasNext()) {
		if(it.next().endsWith("e")) {
			it.remove();
		}}
		System.out.println(list);
	}
	

}
