package com.class34;
import java.util.*;
public class Task1 {
	/*Create a Set collection in which you need to add names of the countries. 
	 * In this set we want all objects to be sorted in alphabetical order. 
	 * Using 2 different ways retrieve all elements from set.
	 */

	public static void main(String[] args) {
		Set<String> st=new TreeSet<>();
		st.add("USA");
		st.add("Turkey");
		st.add("Italy");
		st.add("Germany");
		st.add("France");
		System.out.println("_____advanced loop_____");
		for(String element:st) {
			System.out.println(element);
		}
		System.out.println("___iterator____");
		Iterator<String> it=st.iterator();
		while(it.hasNext()) {
			String element=it.next();			
			System.out.println(element);
		}
		

	}

}
