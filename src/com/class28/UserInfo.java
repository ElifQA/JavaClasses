package com.class28;

	public class UserInfo extends User{
		
		String address;
		
		public UserInfo(String name, int mNumber, String address) {
			super(name, mNumber);
			this.address=address;
			
		}
		public void print() {
			System.out.println(name+mNumber+address);
		}
		public static void main(String[] args) {
			UserInfo user=new UserInfo("James ", 568,"65 main street");
			user.print();
			
			
			
		}
	}
		

