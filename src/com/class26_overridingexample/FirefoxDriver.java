package com.class26_overridingexample;

public class FirefoxDriver extends WebDriver{
	public void open () {
		System.out.println("Opening firefox browser");
	}
	public void getTitle() {
		System.out.println("Getting title on firefox browser");
	}

}
