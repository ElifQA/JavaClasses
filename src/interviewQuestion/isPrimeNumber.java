package interviewQuestion;

import java.util.Scanner;

public class isPrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number to chek prime or not");
		int num=scan.nextInt();
		
		boolean isPrime=true;
		
		for (int i=2; i<num; i++) {
			if (num%i==0) {
				isPrime=false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num+ " is prime number");
		}else {
			System.out.println(num+ " is not prime");
			
		}
			
			//Scanner sc =new Scanner(System.in);
			
			System.out.println("enter number");
			int number=scan.nextInt();
			
			boolean Prime=true;
			for (int i=2; i<number; i++) {
			if (number%i==0) {
				Prime=false;
				break;
			}}
			if(Prime) {
				System.out.println(number +"prime");
			}else {
				System.out.println(number + " is not ");
			}
			
			}
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
	


