package com.class34;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.*;
public class Task2 {
	/*
	 * Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 */
	public static void main(String[] args) {

		Set<String> st = new LinkedHashSet<>();
		st.add("Ankara");
		st.add("istanbul");
		st.add("Berlin");
		st.add("Atlanta");
		st.add("Tokyo");

		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A")) {
				it.remove();

			}
		}
		System.out.println(st);
	}



}
	
