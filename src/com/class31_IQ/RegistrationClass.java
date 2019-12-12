package com.class31_IQ;

public class RegistrationClass {
	/*Create Registration Class in which you would have variables 
	 * as email, userName and password that have an access scope only 
	 * within its own class. 
	 * After creating an object of the class user should be able 
	 * to call methods and in each method separately pass values 
	 * to set users email, username and password. 
	Requirements: 
	Valid email consider to be only gmail
	Valid userName and password cannot be empty and 
	should be of length larger than 6 characters. 
	Also valid password cannot contain userName.*/

		private String email, userName, password;

		// setting email
		public void setEmail(String email) {
			if (email.contains("gmail.com")) {
				this.email = email;
			} else {
				System.out.println("Invalid email type. Email must be gmail");
			}
		}

		// getting email
		public String getEmail() {
			return email;
		}

		// setting username
		public void setUsername(String userName) {
			if (!userName.isEmpty()) {
				if (userName.length() > 6) {
					this.userName = userName;
				} else {
					System.out.println("Username should have more than 6 characters");
				}
			} else {
				System.out.println("Username cannot be empty");
			}
		}

		// get the username
		public String getUsername() {
			return userName;
		}

		// set password
		public void setPassword(String password) {

			if (!password.isEmpty()) {

				if (password.length() > 6) {

					if (!password.contains(userName)) {
						this.password = password;
					} else {
						System.out.println("Password cannot contain username");
					}
				} else {
					System.out.println("Password should have more than 6 characters");
				}

			} else {
				System.out.println("Password cannot bwe empty");
			}
		}
		// get password
		public String getPassword() {
			return password;
		}
	}
	
