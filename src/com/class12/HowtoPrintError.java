package com.class12;

public class HowtoPrintError {

	public static void main(String[] args) {
		int a=2;
		if(a==20) {
			System.out.println("number is "+a);
		}else {
			System.err.println("number was not 20 but is "+a);
		}

	}

}
