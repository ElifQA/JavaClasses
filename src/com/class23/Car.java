package com.class23;

public class Car {
	/*we want to build Toyota cars
	 * that will have different models and colors 
	 */
	static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	public void getDetails() {//method header public method access from everywhere
		System.out.println("I build "+color+" "+ make+" "+model);
		System.out.println("");
	}
}
