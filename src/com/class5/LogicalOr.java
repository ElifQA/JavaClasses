package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		//7 days a week
		//if days is 2 or 4 -->SDLC class
		//if day 6 or 7 ---Java class
		//if day 1-5---no class
		//if day 3--- review class
		
		int day=7;
		//false OR false---false
		if (day==2 || day==4) {
			System.out.println("sdlc class");
			//true or false--true
		}else if(day==6 || day==7) {
			System.out.println("java class");
			//false or false---false
		}else if(day==1 || day==5) {
			System.out.println("no class");
			
		}else {
			System.out.println("not valid day");
		}
		
		//7 days a week
		//if days is tuesday or thursday--sdlc class
		//if saturday or sunday --java class
		//monday or friday --no class
		//if day = 3 --review class
		
		String weekDay="Tuesday";
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("sdlc class");
			
		}else if(weekDay.equals("saturday") || weekDay.equals("sunday")) {
			System.out.println("java class");
			
		}else if(weekDay.equals("Monday") || weekDay.equals("friday")) {
			System.out.println("no class");
			
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("review class");
			
		}else {
			System.out.println("not valid day");
		}
		//Task1
		int dys=4;
		if (dys>1 && dys<5) {
			System.out.println("it is a weekday");
			
		}else if( dys==6 || dys==7) {
			System.out.println("it is a weekend");
		}else {
			System.out.println("invalid");
		}
		
		//task2
		int h=6;
		if (h<=5) {
			System.out.println("short");
			
		}else if(h>5 && h<6) {
			System.out.println("medium");
			
		}else if(h>=6) {
			System.out.println("tall");
		}
		
		
		
		
		
		
		
		
				
		
	}

}
