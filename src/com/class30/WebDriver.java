package com.class30;
/*Create a WebDriver Interface that will have the following 
 * unimplemented behaviour: openBrowser(), closeBrowser(), maximizeWindow(),
 *  findElement(). Create 2 classes that implements WebDriver interface: 
 *  ChromeDriver and FirefoxDriver.
 */

public interface WebDriver {

	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();
}

abstract class Browser {

}

class ChromeDriver extends Browser implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Opening Chrome driver");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Chrome driver ");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing Chrome driver window");

	}

	@Override
	public void findElement() {
		System.out.println("Finding element ");

	}

}

class FirefoxDriver implements WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Openin Firefox driver ");

	}

	@Override
	public void closeBrowser() {
		System.out.println("Closing Firefox driver ");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing Firefox driver window ");

	}

	@Override
	public void findElement() {
		System.out.println("Finding element ");

	}

}
