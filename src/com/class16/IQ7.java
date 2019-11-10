package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		/*prime is a number that has to meet 2 conditions
		 * it should be divisible by 1 and by itself only
		 * 2 3 5 7 11  13 17 19 23
		 */
		int number=0;
		boolean isPrime=true;
		
		if(number<=1) {
		
			//if (number==0 || number==1)	{
			isPrime=false;
		}	
		for (int i=2; i<number; i++) {
		
		if (number%i==0) {
			isPrime=false;
			break;
		}
		}
		if (isPrime) {
			System.out.println(number+ " is prime");
		}else {
			System.out.println(number +" not prime");
		}
	}
		

}
