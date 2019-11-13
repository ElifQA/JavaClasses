package com.class18;

public class Recap {
	//define the features----veriable
	int student, teachers, classRooms;
	String name, address, website;
	
	//adding behavior action-----method
	
	void  study() {
		System.out.println("Students studying at "+ name);
	}
	void teach() {
		System.out.println("Teachers teaching at " + name);
    }
		
		public static void main(String[] args) {
			Recap school= new Recap();
			school.name= "Syntax";
			school.student= 200;
			
			Recap school1= new Recap();
			school1.name="Pinnacle";
			school1.student=150;
			
			school1.teach();
			school.study();
			
			 
		 }
	}


