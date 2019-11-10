package com.class17;

public class ObjectOfPhone {
	/*Create a Class “Phone”. 
	 * Create 3 Objects of it:
	 * iPhone, Android, Nokia with specific  attributes and behaviours.
	 */

	public static void main(String[] args) {
		Phone p1=new Phone();
		p1.brand="Iphone";
		p1.name="6s";
		p1.color="gold";
		p1.year=2015;
		p1.memory=64;
		System.out.println("I have "+p1.brand+ " "+p1.name);
		
		p1.call();
		p1.takepicture();
		p1.text();
		
		
		Phone p2=new Phone();
		p2.brand="Android";
		p2.name="samsung";
		p2.color="white";
		p2.year=2016;
		p2.memory=32;
		
		System.out.println("I have "+p2.name+" "+p2.color);
		p2.call();
		p2.takepicture();
		p2.text();
		
		Phone p3=new Phone();
		p3.brand="Nokia";
		p3.name="51 10";
		p3.color="black";
		p3.year=1999;
		p3.memory=16;
		System.out.println("I have "+p3.name+" "+p3.color);
		p2.call();
		
		p2.text();
		
		
	}
	

}
