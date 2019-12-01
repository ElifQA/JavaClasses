package com.class27;

public class Card {
	/* define a class card with 2 methods and this class should have 4
	 * subclasses in which some behavior can be overridden and some can implement 
	 * it is own behavior */

		public void chargeInterest() {
			System.out.println("Card charges 25% interest");
		}
		public void creditLimit() {//overridden
			System.out.println("Credit limit of the card is 5000");
		}
	}
	class AX extends Card{
		public void creditLimit() {//overriding method
			System.out.println("Credit limit of the AX card is 25000");
		}
	}
	class MC extends Card{
		public void creditLimit() {//overriding method
			System.out.println("Credit limit of the MC card is 15000");
		}
		
		public void cashBack() {
			System.out.println("MC gives cash back of 3%");
		}
	}
	class Visa extends Card{
		public void creditLimit() {//overriding method
			System.out.println("Credit limit of the Visa card is 20000");
		}
	}
	class Discovery extends Card{
		public void applePay() {
			System.out.println("Discovery can take apple pay");
		}

}
