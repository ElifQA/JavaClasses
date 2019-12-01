package com.class27_1;

public class StudentTest {
	public static void main(String[] args) {
		SyntaxStudent ss=new SyntaxStudent();
		ss.study();
		//ss.doHomework();ce: not visible since method inside child is private
		ss.attendClasses();
		ss.research();
		
		Student student=new SyntaxStudent();
		student.study();
		student.research();
		student.attendClasses();
		//student.doHomework();ce: not visible since method inside parent is private
	}
}
