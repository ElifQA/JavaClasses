package com.class30;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Toyota();
		obj.drive();
		//obj.DRIVE_FAST=; //CE final value cannot be change
		Toyota toyota =new Toyota();
		toyota.drive();
		toyota.stop();
	}

}
