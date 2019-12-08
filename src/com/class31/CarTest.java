package com.class31;

public class CarTest {

	public static void main(String[] args) {
		Truck obj=new Truck();
		obj.color="Black";
		obj.weight=1600;
		obj.carPrice=26000;
		
		obj.display();
		
		Sedan obj1=new Sedan();
		obj1.carPrice=650000;
		obj1.color="silver";
		obj1.display();
		

	}

}
