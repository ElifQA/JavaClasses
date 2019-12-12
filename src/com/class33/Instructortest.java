package com.class33;

import java.util.ArrayList;
import java.util.List;

class Instructor{
	String name;
	String lastName;
	
	public Instructor( String name, String lastName) {//constructor
		this.name=name;//initilaze instance variables
		this.lastName=lastName;
	}
	public void display() {//method
		System.out.println("Instroctur  full name is "+name+" "+lastName);
	}
}



public class Instructortest {
	public static void main(String[] args) {
	//create a list that will hold 5 instructor
	List <Instructor> ilist=new ArrayList<>();
	ilist.add(new Instructor("Asel", "Umurzakova"));
				//calling constructor and add argument
	ilist.add(new Instructor("Dieago", "Juarz"));
	ilist.add(new Instructor("Mohammed", "shokryn"));	
	ilist.add(new Instructor("Weqas", "Haq"));
	
	for (Instructor i:ilist) {
		System.out.println(i.lastName);
		i.display();
		
		
	}
	}

}
