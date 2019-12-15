package com.class34;

import java.util.HashSet;
import java.util.Set;

public class Student {
	/*Create a Set collection that will hold Objects of Student Type. 
	 * In this set we do not care about the insertion order. 
	 * Each student object should have name and studentID. Display name of each student.
	 */
	
	String name;
	int stId;
	Student(String name, int stId){
		this.name=name;
		this.stId=stId;
	}
	public  void info() {
		System.out.println("Student name is "+name+ "Student Id is "+stId);
		
	}
		

	public static void main(String[] args) {
		Set<Student> st=new HashSet<>();
		st.add(new Student("John", 3654));	
		st.add(new Student("Elif", 8965));
		st.add(new Student("Melek", 6574));
		st.add(new Student("Asim", 8523));
		
		for (Student s:st) {
			
			System.out.println(s.name+" "+s.stId);
		}
	}

}
