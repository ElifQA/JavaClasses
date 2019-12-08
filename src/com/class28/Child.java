package com.class28;


	public class Child extends Parent {
		String name = "James";
		//We can use super keyword to access the data member or field of parent class if parent class 
		//and child class have members with same name.
		
		
		public void callName() {
			System.out.println(name);
			System.out.println(super.name);
			System.out.println(lastName);
		}
		
		
		public void callingMethod() {
			callName();// BY DEFAULT THIS IS ADDED- SO WE ARE CALLING CURRENT CLASS METHOD
			super.callName();
		}
		
		public static void main(String[] args) {
			Child obj = new Child();
			obj.callingMethod();
			obj.callName();
		}
		
	}



