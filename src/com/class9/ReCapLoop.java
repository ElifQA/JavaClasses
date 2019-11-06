package com.class9;

public class ReCapLoop {

	public static void main(String[] args) {
		//for (int i = 0; i < 5; i++) {
			//System.out.println(i);
			//for (int a = 0; a < 5; a++) {
				//System.out.println(a);
			//}
		//}

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.println(i + " " + j);
			}
		}

		// 24hours 60min
		for(int hour = 0; hour <= 24; hour++) {
			for (int min = 0; min < 60; min++) {
				if (min < 10) {

					System.out.println(hour + ":0" + min);
				} else {
					System.out.println(hour + ":" + min);
				}
			}
		}
		

	}
}
