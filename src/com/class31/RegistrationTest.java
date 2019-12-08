package com.class31;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration obj=new Registration();
		obj.setUserName("Elifdemirbuga");
		String myusername=obj.getuserName();
		System.out.println("My user name " +myusername);
		
		obj.setEmail("my@gmail.com");
		String myEmail=obj.getEmail();
		System.out.println("My email "+myEmail);
		
		obj.setPassword("yalova264");
		String myPassword=obj.getPassword();
		System.out.println("My password "+ myPassword);

	}

}
