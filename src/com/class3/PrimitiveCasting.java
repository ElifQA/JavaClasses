package com.class3;

public class PrimitiveCasting {
	public static void main(String[]args) {
		double d=12;
		System.out.println(d);
		//widening or automatic implicit casting
		byte b=127;
		int i=b;
		System.out.println(i);
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing explicit manual casting. do it yourself
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
		 
		int a7=52;
		 long a=a7;
		 System.out.println(a);
		
		double d6=100;
		int i6=(int)+d6;
		System.out.println(i6);
		
		double d7=500.4444;
		long l=(long)d7;
		System.out.println(l);
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
