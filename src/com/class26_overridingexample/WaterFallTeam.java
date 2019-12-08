package com.class26_overridingexample;

	import com.class25.Employee;

	public class WaterFallTeam  extends Employee{

		public static void main(String[] args) {
		
			WaterFallTeam team=new WaterFallTeam();
			team.companyName="Syntax";
			//accessing protected variable in different package
			team.employeeId=102;
			
			
		}
	}


