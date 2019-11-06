package com.class6;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/*ask user to enter boolean value for sale
		 * if no sale --i am not shopping
		 * if sale --check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20--apply 10%
		 * if price between 20-100 --20%
		 * if btwn 100-500--30%
		 * anything--50%
		 * 
		 * after discount -the price of the item reduce from--to--
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("is it on sale?");
		boolean sale=scan.nextBoolean();
		double discount;
		double price;
		double finalPrice;
		
		if (!sale) {
			System.out.println("I am not shopping");
		}else {
				System.out.println("what is the price");
				price=scan.nextDouble();

				
				if (price < 20) {discount = price * 0.10;// finalPrice = price - discount;
				} else if (price >= 20 && price < 100) {
					discount = price * 0.20;
					// finalPrice = price - discount;
					} else if (price >= 100 && price < 500) {
					discount = price * 0.30;
					// finalPrice = price - discount;
					} else {discount = price * 0.50;
					
					}finalPrice = price - discount;
					System.out.println("After discount " + discount + " the price of the item reduce from " + price + " to " + finalPrice);}
						
					}
		
	}


