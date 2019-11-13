package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
	
	public static void main(String[] args) {
		String str="hello";
		str=str.replace("hello","hi ");
		System.out.println(str);
		
		Scanner scan=new Scanner (System.in);
		String scanString=scan.nextLine();
		System.out.println(scanString);
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}
		 // WE CANNOT CREATE A METHOD INSIDE ANOTHER METHOD !
	    
	    void myMethod() {//method header
	        System.out.println("This is user defined method that I created");
	}

}
