package com.class38;


	public class ThrowsExample {

		static String name="John";
		
		public static void main(String[] args){
			
			callingMore();
		}
		
		
		public static void studnetSleeping() throws InterruptedException {
			
			System.out.println("Student is "+name+" is sleeping");
			Thread.sleep(3000);
		}
		
		public static void callingSleepingStudent() throws InterruptedException {
			studnetSleeping();
		}
		
		public static void callingMore() {
			try {
				callingSleepingStudent();
			} catch (InterruptedException e) {
				System.out.println("Interrupted Exception");
			}
		}
	}


