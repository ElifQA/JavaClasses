package com.class25;

public class Employee {
	int salary;//accesible within same package
	protected static String companyName;
	
	protected int employeeId;
	private String employeeSsn;
	void work() {
		System.out.println("I work in "+companyName+" company");
	}
	void getPaid() {
		System.out.println("I get paid "+salary);
	}
}
