package com.class32;

import java.util.ArrayList;

public class TaskArrayList {

	public static void main(String[] args) {
		//generic
	ArrayList<String>arrayList=new ArrayList<>();
	
	arrayList.add("Ayse");
	arrayList.add("Ali");
	arrayList.add("Veli");
	arrayList.add("John");
	arrayList.add("Jane");
	System.out.println(arrayList.size());
	System.out.println(arrayList.isEmpty());
	System.out.println(arrayList.contains("Ali"));
	System.out.println(arrayList.get(1).isEmpty()); 
	System.out.println(arrayList);
	
	//ArrayList non generic
	ArrayList alist=new ArrayList();
	alist.add("Ayse");
	alist.add(5);
	alist.add(10.20);
	System.out.println(alist);
	
	ArrayList<Double> list=new ArrayList<Double>();
	list.add(100.20);
	
	
	
	
	
	
	
	
}}
