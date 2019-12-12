package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	String name;
	int studentId;
	
	public Student(String name, int studentId) {
		this.name=name;
		this.studentId=studentId;
	}
	public void display() {
		System.out.println("My name is  "+name+" and my students  id is "+studentId);
	}
}

public class StudentTest {

	public static void main(String[] args) {
		//create arraylist taht will store student
		List<Student>students=new ArrayList<>();
		//creating student type of  object
		Student stu=new Student("John", 101);
		Student stu1=new Student("Jen", 102);
		Student stu2=new Student("ali", 103);
		
		students.add(stu);
		students.add(stu1);
		students.add(stu2);
		
		//display info of each student
		stu.display();//access to the method
		System.out.println(stu.name);//access to variables after creating object
		System.out.println(stu.studentId);
		stu1.display();
		//for each loop
		for (Student student :students) {
			student.display();
		}
		//adding more object of a student type
		students.add(new Student("Michael", 104));
		students.add(new Student("David", 105));
		students.add(new Student("Esra", 106));
		

		
		//display info of each student
		Iterator<Student>myIterator=students.iterator();
		while(myIterator.hasNext()) {
			//myIterator.next().display();
			Student obj=myIterator.next();
			obj.display();
			
			
			
		}
		
		

		
		
		
		
		
	}

}
