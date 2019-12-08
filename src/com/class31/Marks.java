package com.class31;

public abstract class Marks {
	/*
	 * We have to calculate the percentage of marks obtained in three subjects (each
	 * out of 100) by student A and in four subjects (each out of 100) by student B.
	 * Create class ‘Marks’ with an abstract method ‘getPercentage’. It is inherited
	 * by classes ‘A’ and ‘B’ each having a method with the same name which returns
	 * the percentage of the students. The constructor of student A takes the marks
	 * in three subjects as its parameters and the marks in four subjects as its
	 * parameters for student B. Test your code
	 */

	abstract void getPercantage();

}

class A extends Marks{
	int a, b, c;

	A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

	}

	@Override
	void getPercantage() {
		double average=(a+b+c)/3;
		System.out.println(average);
		
	}

	}
class B extends A{
	int d;
	B(int a, int b, int c, int d){
		super( a, b, c);
		this.d=d;
	}
	@Override
	void getPercantage() {
		double average=(a+b+c+d)/3;
		System.out.println(average);
		
	}
	
}