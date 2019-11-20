package com.class21;

	public class Employee {
	/*CreateaClasscalledEmployee:
		● Create three variables eID , salary
		and set the CEO to “Sumair”
		● Create two objects of the class
		Employee
		● Set the value of eID, salary for each of
		the objects
		● Print out the eID , salary and CEO for
		each of the objects
	*/
		int eID, salary;
		static String CEO="Sumair";
		
		void printInfo() {
			System.out.println("Employee ID "+ eID+ " salary is "+salary+ " CEO is "+CEO);
			
		}
		
		
		public static void main(String[]args) {
			Employee em1=new Employee ();
			em1.eID=856925;
			em1.salary=750000;
			em1.CEO="Sumair";
			em1.printInfo();
			
			Employee em2=new Employee();
			em2.eID=856611;
			em2.salary=800000;
			em2.printInfo();
		}
	}
	