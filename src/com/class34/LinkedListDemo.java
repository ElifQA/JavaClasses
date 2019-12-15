package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello");
		llist.add("Bye");
		llist.add(2, "How are you?");
		System.out.println(llist);
		//replace 1 element
		llist.set(1, "Good bye");
		System.out.println(llist);
		
		//retrive 1 elemnt
		String element=llist.get(2);
		System.out.println(element);
		
		//retrieve all elements
		System.out.println("for loop");
		for (int i=0; i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		for (String list :llist) {
			System.out.println(list);
		}
		
		Iterator<String>it=llist.iterator();
		while(it.hasNext()){
			System.out.println(llist);
		}
	}

}
