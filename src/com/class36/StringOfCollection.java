package com.class36;

import java.util.LinkedHashSet;
import java.util.Set;

//Create the collection that will store single uniques 
	//Objects of a String type in which order is preserved.
	//Write a logic to concatenate all string from the collection.

public class StringOfCollection {

	public static void main(String[] args) {
	Set<String> map=new LinkedHashSet<>();
	map.add("Hersey");
	map.add("cok");
	map.add("guzel");
	map.add("olacak!");
	
	for(String str:map) {
		System.out.print(str+" ");
	}	
	}

	}


