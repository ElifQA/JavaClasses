package com.class30;

public class WebDriverTest {

	public static void main(String[] args) {
	WebDriver obj=new ChromeDriver();
	WebDriver obj1=new FirefoxDriver();
	
	obj.openBrowser();
	obj.closeBrowser();
	obj.maximizeWindow();
	obj.findElement();
	
	obj1.openBrowser();
	obj1.closeBrowser();
	obj1.maximizeWindow();
	obj1.findElement();

	}

}
