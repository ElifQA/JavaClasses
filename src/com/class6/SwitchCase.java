package com.class6;

public class SwitchCase {

	public static void main(String[] args) {
		
		/*7 days Weekdays
		 * if day==1 monday
		 * day==2 tuesday
		 */
		int day = 6;
		String weekDay;
		if (day == 1) {
			weekDay = "Monday";
		} else if (day == 2) {
			weekDay = "Tuesday";
		} else if (day == 3) {
			weekDay = "Wednesday";
		} else if (day == 4) {
			weekDay = "Thursday";
		} else if (day == 5) {
			weekDay = "Friday";
		} else if (day == 6) {
			weekDay = "Saturday";
		} else if (day == 7) {
			weekDay = "Sunday";
		} else {
			weekDay = "Invaid";
		}
		System.out.println(weekDay);
		
		
		day=3;
		switch (day) {
		
		case 1:// day==1
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tueday";
			break;
		case 3:
			weekDay = "Wednesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invaid";
		}
		System.out.println(weekDay);
	}
	}


