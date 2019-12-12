package com.class33;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTask {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		
		for(int i=1; i<20 ; i++) {
			if(i%2 ==0) {
				list.add(i);
		}}
		System.out.println(list);
		
		for (int i=1; i<list.size(); i++) {
		System.out.print(	list.get(i)+" ");
		}
		System.out.println();
		
		for(Integer i:list) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Iterator<Integer> i=list.iterator();
		while (i.hasNext()) {
		System.out.print(i.next()+" ");
		}

	}

}
