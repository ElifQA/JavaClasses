package com.class25;

public class Test {

	public static void main(String[] args) {
		System.out.println("Creating an object of Employee class  ");
		Employee emp=new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax"; //static accsess by class name
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of Scrum team class  ");
	ScrumTeam sm=new ScrumTeam();
	sm.salary=90000;
	sm.work();
	sm.getPaid();
	sm.artifacts="Product Backlog, Sprint Backlog, Burn Down chart, ";
	sm.ceremonies="Sprint Demo, Planning, Retro, Daily standup";
	sm.attendScrumMeetings();
	
	System.out.println("---Creating an object of a Developer class-----");
	Developer dev=new Developer();
	dev.salary=130000;
	dev.work();
	dev.getPaid();
	dev.code();
	dev.artifacts="Sprint Backlog";
	dev.ceremonies="Sprint Demo, Planning, Retro, Daily standup";
	dev.attendScrumMeetings();
	dev.employeeId=101;
	//dev.employeeSsn= not accessible 
	System.out.println("---Creating an object of a Tester class-----");
	Tester ts=new Tester();
	ts.salary=75000;
	ts.work();
	ts.getPaid();
	ts.test();
	ts.artifacts="Sprint Backlog";
	ts.ceremonies="Sprint Demo, Planning, Retro, Daily standup";
	ts.attendScrumMeetings();
	
	
	}
	

}
