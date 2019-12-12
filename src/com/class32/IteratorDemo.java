package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {

		ArrayList<String> strList = new ArrayList<>();
		strList.add("Sveta");
		strList.add("Sasha");
		strList.add("Mohamad");
		strList.add("Alli");
		strList.add("Zeynep");
		
		//retrieve values from an ArrayList
		//1 - for loop
		for (int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		//2 - using enhanced for loop
		for (String name:strList) {
			System.out.println(name);
		}
		//3 way - using Iterator
		Iterator<String>it=strList.iterator();
		
	}
}
