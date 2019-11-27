package com.class24;

import java.awt.Container;

public class Constructor {

	void Constructor() {
		System.out.println("Hello");
	}
	
	Constructor() {
		System.out.println("I am a constructor");
	}
	
	public static void main(String[] args) {
		
		Constructor obj=new Constructor();
		obj.Constructor();
		
	}
}
