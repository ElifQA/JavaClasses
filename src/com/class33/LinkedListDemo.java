package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//crate linked list of String object
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		
		System.out.println(llist.size());
		llist.add("selam");
		llist.add("Bye1");
		//retrieve
		System.out.println(llist.get(1));
		//update/replace
		llist.set(2, "Hi");
		System.out.println(llist);
		//how to 
		

	}

}
