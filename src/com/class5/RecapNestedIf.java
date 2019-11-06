package com.class5;

public class RecapNestedIf {

	public static void main(String[] args) {
	
		boolean isDisplayed=true;
		String buttonText="Sign in";
		
		if(isDisplayed) {
			System.out.println("Button is displayed");
			
			if(buttonText.equals("Sign in")) {
				System.out.println("Test case pass");
			}else {
			System.out.println("wrong case pass");
			}}else {
			System.out.println("button is not");
		}
		
		
	}

	}

