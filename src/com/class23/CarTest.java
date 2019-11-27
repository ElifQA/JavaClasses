package com.class23;

public class CarTest {

	public static void main(String[] args) {
		Car.make="Toyota";
		Car car1=new Car();
		car1.model="Camry";
		car1.color="Pink";
		car1.speed=200;
		car1.doors=4;
		car1.getDetails();
		
		BetterCar.make = "Toyota";
		BetterCar betterCar1 = new BetterCar("Corrola", "White", 180, 5);

		betterCar1.getDetails();
		
		Car car2=new Car();
//		car2.model="Corolla";
//		car2.color="Blue";
//		car2.speed=150;
//		car2.doors=2;
//		car2.getDetails();
//		
		Car car3 = new Car();
		car3.getDetails();
	}
		

	}


