package com.class33;

public abstract class Card {
	/*
	 * Create a Card class that will have implemented and unimplemented methods and
	 * a constructor that will initializes credit card type. Create 3 subclasses of
	 * a Card card. Create 3 objects of different card and store them into
	 * LinkedList. Using for loop/advanced for loop/ iterator access all methods of
	 * the class.
	 * 
	 */

	String cardType;

	Card(String cardType) {
		this.cardType = cardType;
	}

	public void openAccount() {
		System.out.println("Thank you for opening acount with " + cardType);
	}

	public abstract void interestRate();

	public abstract void transferFee(double amount);

}

class Visa extends Card {

	Visa(String cardType) {
		super(cardType);

	}

	@Override
	public void interestRate() {
		System.out.println("Interest rate with  " + cardType + " is %5.");

	}

	@Override
	public void transferFee(double amount) {
		System.out.println("money transfer fee with " + cardType + " is free.");

	}}

class Master extends Card {

	Master(String cardType) {
		super(cardType);
}

	@Override
	public void interestRate() {
		System.out.println("Interest rate with " + cardType + "is %3. After 12 months it will be %5");
}

	@Override
	public void transferFee(double amount) {
		if ((amount <= 200) && (amount >= 5000)) {
			System.out.println("Transfer fee is free with " + cardType);
		} else {
			System.out.println("Transfer fee is %2 with " + cardType);
		}

	}

}

class Amex extends Card {

	Amex(String cardType) {
		super(cardType);

	}

	@Override
	public void interestRate() {
		System.out.println("Intesret rate is %2 with " + cardType);

	}

	@Override
	public void transferFee(double amount) {
		if ((amount > 1000)) {
			System.out.println("Transfer fee is %5");
		} else {
			System.out.println("Transfer fee is free with " + cardType);
		}

	}

}