package com.class28;

public class DeviceTest {

	public static void main(String[] args) {
		Apple apple=new Apple("iPhone", "11Pro");
		System.out.println(apple.deviceType);
		
		Apple apple1=new Apple("iPad", "12 Pro");
		System.out.println(apple1.deviceType);
	}

}
