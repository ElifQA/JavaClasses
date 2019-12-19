package com.class36;
import java.util.*;
import java.util.Map.Entry;
public class Person1 {
	// Create a Person class with following private fields: name, lastName, age,
		// salary.
		// Variables should be initialized through constructor.
		// Inside the class also create a method to print user details.
		// In Test Class create a Map that will store key in ascending order.
		// In that map store personId and a Person Object. Print each object details.
	private String name, lastName;
	private int age, salary;
	
	Person1(String name, String lastName, int age, int salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	public void display() {
		System.out.println("Name and lastname is "+ name+ " "+lastName+ ", age and salary :"+age+", "+salary);
	}
	public static void main(String[] args) {
		Map< Integer, Person1> map=new TreeMap<>();
		map.put(1, new Person1("John", "B", 56,8000000));
		map.put(2, new Person1 ("ali", "K", 85,60000));
		map.put(3, new Person1("ayse","L", 23, 6500000));
		map.put(2, new Person1("Simith", "C", 45, 6500000));
		map.put(4, new Person1("Adam", "D.", 50, 8000000));
		
		Set<Entry<Integer, Person1>> entry=map.entrySet();
		for(Entry<Integer, Person1> per:entry) {
			
			System.out.print(per.getKey()+" ");
			per.getValue().display();
		}
		
	}

}
