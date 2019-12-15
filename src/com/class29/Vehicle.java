package com.class29;

public abstract class Vehicle {
	public void drive() {
		System.out.println("vehicle can drive");
	}

	public void stop() {
		System.out.println("vehicle can stop");
	}
//unimplemented method
	public abstract void start();

	public abstract void speed();
}

abstract class Car extends Vehicle {

	public void speed() {
		System.out.println("Max car speed up to 400");
	}

	public abstract void breaking();
}

class BMW extends Car { // this class is concrete class.. There is no unimplemented methods
	@Override
	public void start() {
		System.out.println("BMW starts remotely");
	}

	@Override
	public void breaking() {
		System.out.println("BMW can break");
	}

	
}
