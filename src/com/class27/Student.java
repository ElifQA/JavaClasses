package com.class27;

public class Student {
	/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent. 

Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
*/
	public void grade() {
		System.out.println("A,B,C,D,F ");
	}
	public void study() {
		System.out.println("Student needs to study");

}
}
class SyntaxStudent extends Student{
	public void grade() {
		System.out.println("B");
	}
	public void study() {
		System.out.println("Student needs to study");

}
	
	public void homework() {
		System.out.println("student has homework everyday");
	}}
class CollegeStudent extends Student{
		public void grade() {
			System.out.println("A");
		}
		public void study() {
			System.out.println("Student need to study");

	}
}
class SchoolStudent extends Student{
	public void grade() {
		System.out.println("C");
	}
	public void study() {
		System.out.println("Student need to study");

}
			public void exam() {
			System.out.println("Student take an exam tomorrow");
		}
		}
	

	
	



