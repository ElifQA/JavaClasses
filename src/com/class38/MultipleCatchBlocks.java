package com.class38;
public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
				
				division(12, 0);
				division(12, 2);
				
				System.out.println(10/2);
			}
			
			public static void division(int num1, int num2) {
				
				int result;
				
				try {
					result=num1/num2;//new ArithmeticException();
					System.out.println(result);
					Thread.sleep(5000);//new InterruptedException();
				}catch (ArithmeticException e) {
					System.out.println("Please do not pass o as a second number");
				}catch(InterruptedException e) {
					System.out.println("Someone interrupted program sleep");
				}catch (Exception e) {
					System.out.println("Catching all types of exception");
				}	
				System.out.println("End of my method");
			}}