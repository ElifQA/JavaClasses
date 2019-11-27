package com.class25_1;

public class Addition {
	// method overloading: having same method name in the same class
	// 1st way  by passing different amount of parameters
	    
	    public void add(int num1, int num2) {
	        System.out.println(num1+num2);
	    }
	    
	//  public int add(int num1, int num2) { --->compiler will give error
//	      return num1+num2;
	//  }
	    
	    public void add(int num1, int num2, int num3) {
	        System.out.println(num1+num2+num3);
	    }
	    
	    // 2nd way by having different types of parameters
	    
	    public void add(double num1, double num2) {
	        System.out.println(num1+num2);
	    }
	    public void add(int num1, double num2) {
	        System.out.println(num1+num2);
	    }
	    
	    public static void main(String[] args) {
	        Addition obj=new Addition();
	        obj.add(45,46);
	        obj.add(12, 13);
	        obj.add(12, 13,14);
	        obj.add(12.09, 12.10);
	        obj.add(13.5, 20);
	    
	    
	        String str="Hello";
	        System.out.println(str.substring(3));
	        System.out.println(str.substring(1, 3));
	        
	        
	        
	        
	    }
}
