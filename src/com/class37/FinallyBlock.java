package com.class37;

public class FinallyBlock {

	public static void main(String[] args) {
		String str="Hello";
		
		try {
			char charter=str.charAt(20);
			System.out.println(charter);
		}catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("I am a finally block");
		}
		System.out.println("end of the code");		

	}

}
