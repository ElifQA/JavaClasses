package com.class9;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {// outer loop control repetition of inner loop
			System.out.println(i);
			for (int j = 1; j <= 3; j++) {
				System.out.println("I am inner loop");
			}
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}
		// 24 hours, 60 min
		for (int hour = 0; hour < 24; hour++) {
			for (int min = 0; min < 60; min++) {
				if (min < 10) {
					System.out.println(hour + ":0" + min);
				} else {
					System.out.println(hour + ":" + min);
				}
				
				
				}

		}
		//month12 day30
		//for (int month = 1; month < 13; month++) {
			//for (int day = 1; day < 31; day++) {
				//int year = 2019;
				//if (day<10) {
					
				//	System.out.println(month+"/0"+day+"/"+year);
				//}else {
				
				//System.out.println(month + "/" + day + "/" + year);
				//}}
		//}
		
		}
		}
		
	

