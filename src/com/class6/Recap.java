package com.class6;

public class Recap {

	public static void main(String[] args) {
		/*declare the time 1-24
		 * based on the time identfy it morning afternoon evening or night
		 * if 1-11--morning
		 * 12-15 noon
		 * 16-20-evening
		 * 20>night
		 * 
		 */
		int time=12;
		String timeOfDay=null;
		
		if (time>=1 && time <=11) {
			timeOfDay="Morning";
		}else if(time>=12 && time<=15) {
			timeOfDay="Noon";
		}else if(time>=16 && time<=20) {
			timeOfDay="evening";
		}else if(time>20 && time <=24) {
			timeOfDay="Night";
		}else {
			System.out.println("your time is invalid");
			timeOfDay="Invalid";
		}
		
		System.out.println("Time of the day is "+timeOfDay);
		
		
		}


	}


