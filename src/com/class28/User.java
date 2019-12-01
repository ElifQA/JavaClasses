package com.class28;
/*Write program: userClass  that has a constructor that initializes 
 * name and mobile number istance variables. Create a subclass  userInfo 
 * that will have user address variable and it also being initialized 
 * through constructor call. Print users name, mobile number and address in userDetails method. Test your code.
 */

public class User {
	String name;
	int mobileNumber;
	
	public User(String name, int mobileNumber) {
		this.name=name;
		this.mobileNumber=mobileNumber;
	}

}
class UserInfo extends User{
	String address;
	UserInfo(String name, int mobileNumber, String address){
		super(name, mobileNumber);
		this.address=address;
		
	}
	public void callInfo() {
		System.out.println(name+mobileNumber+address);
	}
	
	

		
	}




	