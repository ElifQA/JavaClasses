package com.class33;
/*Create  a  class  Insurance  that  will  have  an attribute as
 *  insuranceName and unimplemented behaviour  as  getQuote  and  cancelInsurance.
 *   Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as 
 *   carModel and Class Pet has petType  attribute.  Create  3  objects  of  the  sub classes  
 *   and  store  them  in  ArrayList. 
 *  Using  for loop/advanced  for  loop/  iterator  access  all methods of the class. 
 */

public abstract class Insurance {
	String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();

}
class Car extends Insurance {
	String carModel;

	public Car(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel = carModel;
	}
	@Override
	public void getQuote() {
		System.out.println("Insurance name is " + insuranceName + " Quote for " + carModel + " is $600.");
	}

	public void cancelInsurance() {
		System.out.println("I am cancelling " + insuranceName + " insurance.");
	}
}
class Pet extends Insurance {
	String petType;

	public Pet(String insuranceName, String petType) {
		super(insuranceName);
		this.petType = petType;
	}

	@Override
	public void getQuote() {
		System.out.println("Insurance name is " + insuranceName + " Quote for " + petType + " is $10000 a year");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("I am cancelling pet Insurance name is  " + insuranceName);

	}
}

class Health extends Insurance {
	public Health(String insuranceName) {
		super(insuranceName);
	}

	@Override
	public void getQuote() {
		System.out.println("Insurance name is " + insuranceName + " Quote for health is $450 a month ");

	}

	@Override
	public void cancelInsurance() {
		System.out.println("I am cancelling health insurance name is " + insuranceName);

	}

}