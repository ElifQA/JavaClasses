package com.class19;

public class TestAllMethods {

	public static void main(String[] args) {
		
	        AllMethods obj = new AllMethods();
	      // find the largest number 300 and 500
	     // then identify is the largest number is Odd
	     
	     
	        
	     int large = obj.findLargest(300, 499);
	     System.out.println(large);
	     boolean isOdd = obj.isOdd(large);
	     System.out.println(isOdd);
	     
	     //call method weekdayname 
	     //if tuesday, Wednesday , Thursday, saturday, Sunday
	     //I am learning Java
	     String day=obj.weekDayName(4);
	     if (day.equals("Tuesday") || day.equals("Wednesday")||day.equals("Thursday")) {
	    	 System.out.println("I am learning java");
	     }else {
	    	 System.out.println("more practice");
	     }
	     
	}

}
