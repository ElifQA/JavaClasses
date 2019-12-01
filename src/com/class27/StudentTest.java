package com.class27;

public class StudentTest {

	public static void main(String[] args) {
	Student	 s=new Student();
	s.study();
	s.grade();
	
	Student s1=new SyntaxStudent();
	s1.study();
	s1.grade();
	
	Student s2=new CollegeStudent();
	s2.study();
	
	Student s3=new SchoolStudent();
	s3.study();
	Student []st= {s,s1,s2,s3};
	for (Student ss:st) {
		ss.study();
		ss.grade();
		
		
	}
	}

}
