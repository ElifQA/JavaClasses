package com.class4;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
	
		//task
			Scanner input =new Scanner(System.in);
				System.out.println("Enter numbers of worked years");
				int years=input.nextInt();
				
				System.out.println("Enter your salary");
				double salary=input.nextDouble();
				
				if (years>=5) {
					System.out.println("Eligible for bonus");
					
					if (salary>50000) {
						System.out.println("the bonus 5000");
					}else {
						
						System.out.println("not eligible for bonus");
					}
				}else {
					System.out.println("the bonus 3000");
				}
				


	}

}
