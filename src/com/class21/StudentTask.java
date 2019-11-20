package com.class21;

public class StudentTask {
	
	 /*Create three variables studentName , studentID and numberOfStudents
	 ● Create three objects of the Students Class
	 ● Set the value for studentName , studentID and increment the numberOfStudents for each object
	 ● Print out total number of students
*/
	public String studentName;
	public int studentID; 
	public static int numberOfStudents;
	
	public static void main(String[] args) {
		StudentTask st1=new StudentTask();
		StudentTask st2=new StudentTask();
		StudentTask st3=new StudentTask();
		
		st1.studentName="ali";
		st2.studentName="Elif";
		st3.studentName="Ayse";
		
		st1.studentID=56;
		st2.studentID=69;
		st3.studentID=36;
		
		StudentTask.numberOfStudents++;
		StudentTask.numberOfStudents++;
		StudentTask.numberOfStudents++;
		System.out.println(" total number of students "+StudentTask.numberOfStudents);
	}

}
