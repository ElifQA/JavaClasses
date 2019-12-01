package com.class27;

public class Car {
	String make, model;
	int year;
	
	Car(){
		System.out.println("I am non argument constructor");
	}
	Car (String make, String model){
		this.make=make;
		this.model=model;
	}
	
	public static void main(String[] args) {
		//Car car=new Car();
		//car.display();
		
//		int num; --> CE:local variables must be inialized
//		System.out.println(num);
		System.out.println("---------Object f child class-------------");
		//Tesla tesla=new Tesla();
		Tesla tesla1=new Tesla("Tesla", "S4",true);
		tesla1.display();
		System.out.println("----crating another object-------");
		Tesla tesla2=new Tesla("TeslaXL", "S8",false);
		tesla2.display();
	}
}
class Tesla extends Car{
	boolean autoPilot;
	Tesla(){
		//super(); compiler will add by default to make a call to super class
		//constructor to initialize and object
		System.out.println("Non argument constructor of the child class");
	}
	Tesla (String make, String model,boolean autoPilot){
		super(make, model);//constructor call
		this.autoPilot=autoPilot;
		
	}
	public void display() {
		System.out.println("We build "+make+" "+model+" has an autopilot "+autoPilot);
	}
}
