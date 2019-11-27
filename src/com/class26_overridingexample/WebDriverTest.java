package com.class26_overridingexample;

public class WebDriverTest {

	public static void main(String[]args){
	ChromeDriver chrome=new ChromeDriver();
	chrome.open();
	chrome.refresh();
	
	FirefoxDriver firefox=new FirefoxDriver();
	firefox.refresh();
	firefox.open();
	System.out.println("---------------");
	
	//creating an object of child class and given reference to the parent
	WebDriver driver =new FirefoxDriver();
	driver.open();
	driver.refresh();
	//no access to child specific class through Parent type
	}

}
