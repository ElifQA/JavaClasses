package com.class19;

public class Task1 {
	String createEmail(String userName, String lastName, String emailType ) {
		
		String email=userName+lastName+"@"+emailType+".com";
				return email;
	}

	public static void main(String[] args) {
		/*Create a method createEmail(). Based on provided users name, 
		 * lastName and email type, your method should return complete email Address. 
		 * Example: johnsnow@gmail.com or johnsnow@yahoo.com*
		 * 
		 */
	Task1 obj=new Task1();
	String email=obj.createEmail("elif", "demir", "gmail");
	System.out.println(email);
	
	}
	

}
