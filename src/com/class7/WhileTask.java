package com.class7;

public class WhileTask {

	public static void main(String[] args) {

		// Create a boolean variable workDay and assign true create int variable day and
		// assign it to 1
		// As long as it is workDay print “I need a day off” and increase day.
		// Once day is 6 print “I do not need a day off any more”

		int day = 1;
		boolean workDay = true;

		while (workDay) {

			if (day == 6) {  //if (day==6 || day==7)
				workDay = false;
				System.out.println("i don't need a day off anymore");

			} else {
				System.out.println("i need a day off ");

			}
			day++;
		}
		//////////////
		int i = 1;
		while (i <= 20) {
			System.out.print(i);
			i++;
		}
		System.out.println("**********");

		int a = 10;
		while (a >= 1) {
			System.out.print(a);
			a--;
		}
		System.out.println("************");
		int b = 50;
		while (b >= 20) {
			System.out.print(b);
			b--;
		}
		System.out.println("----------------");

		int c = 2;
		while (c <= 20) {
			if (c % 2 == 0) {
				System.out.print(c);
			}
			c++;
		}
		int d = 100;
		while (d >= 2) {
			if (d % 2 == 0) {
				System.out.println(d);
			}
			d -= 2;
		}
		
		}

	}

