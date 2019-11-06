package com.class12;

import java.util.Scanner;

public class TaskPassword {

	public static void main(String[] args) {
		/*
		 * Accept username, password and confirm password and check following
		 * requirements: Username and Password cannot be empty, if so→ message=“Username
		 * and Password cannot be empty”. Password should be minimum 8 characters, if
		 * less → message=“Password is too short”. Password cannot contain username if
		 * so, → message=“Password cannot contain username”. Password should match
		 * confirmed password, if not → message=“Passwords do not match”. Only after all
		 * requirements met → message “Your username and password has been created”
		 */
		Scanner scan=new Scanner(System.in);
		
		String username, password, conpassword;
		while (true){
		System.out.println("please enter your username");
		username=scan.nextLine();
		System.out.println("please enter your password");
		password=scan.nextLine();
		System.out.println("please confirm your password");
		conpassword=scan.nextLine();
		if (username.isEmpty() || password.isEmpty()) {
			System.out.println("username and password cannot be empty");
			continue;
		}
		if (password.length()<=8) {
			System.out.println("password is too short");
			continue;
		}
		if (password.contains(username)) {
			System.out.println("The password can not contain username");
			continue;
		}
		if (!password.equals(conpassword)) {
			System.out.println("Password do not match");
		}else {
			System.out.println("Your username and password has been created");
			break;
		}
			
			
		}	
		
	
	
	}
	
	

}
