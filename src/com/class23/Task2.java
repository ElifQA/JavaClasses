package com.class23;

public class Task2 {
	/*Write a java program of Class Students that takes students name 
	 * and 3 subject grades. Inside your class also have a method to 
	 * Calculate Average Grade. Test Student class for 5 different students 
	 * with different marks. Your program should print an average mark of each students name.
	 */
   //NOTE: please use different names for instance and local variables.
	
	
	String name;
	int grade1;
	int grade2;
	int grade3;
	int GPA;
	
	Task2(String studentName, int gr1, int gr2 , int gr3){
		name=studentName;
		grade1=gr1;
		grade2=gr2;
		grade3=gr3;
	}
	public static void main(String[]args) {
		Task2 s1=new Task2("Ayse ", 65, 85, 96);
		s1.calculateAverage();
		Task2 s2=new Task2("Elif ", 90,69,58);
		s2.calculateAverage();
		Task2 s3=new Task2("Adam", 55,78,89);
		s3.calculateAverage();
		Task2 s4=new Task2("Adem", 55,68,89);
		s4.calculateAverage();
		Task2 s5=new Task2("Bahar", 89,78,69);
		s5.calculateAverage();
		
		
		
		
		
	}
	public void calculateAverage() {
		int average=(grade1 +grade2+ grade3)/3;
		System.out.println("Student "+name+" has an average grade of "+average);
		
	}
}
