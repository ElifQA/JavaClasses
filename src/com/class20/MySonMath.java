package com.class20;

public class MySonMath {
	
	public String name;
	String phone;
	private String SSN;
	protected String birthday;

	//public can be seen/accessed
	//from everywhere
	public void add1() {
		int num1 = 2;
		int num2 = 1;
		int result = num1 + num2;
	}

	//default can be seen/accessed
	//within package
	void add2(int num1, int num2) {
		int result = num1 + num2;
	}

	//protected can be seen/accessed
	//within package
	protected int add3() {
		int num1 = 4;
		int num2 = 2;
		int result = num1 + num2;
		return result;
	}

	//protected can be seen/accessed
	//within package
	protected int add4(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	//private can be seen/accessed
	//only within this class
	private void add5() {
		int result = 6;
	}

}
