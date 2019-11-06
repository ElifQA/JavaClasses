package com.class4;

public class Task2 {
	public static void main(String[]args) {
		
		double rate=5.5;
		double price=200000;
		
		if (rate>=4.5) {
			System.out.println("will not buy house");
		}else {
			System.out.println("buy a house");
			
			if (price>200000) {
				System.out.println("Take a loan");
			}else {
				System.out.println("will pay cash");
			}
		}
	}

}
