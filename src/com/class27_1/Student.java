package com.class27_1;

public class Student {
	public void study() {
		System.out.println("Student needs  to study");
	}

	private void doHomework() {
		System.out.println("Student needs  to do homework");
	}

	protected void research() {
		System.out.println("Student needs  to do research");
	}

	void attendClasses() {
		System.out.println("Student needs  to do attend classes");
	}
}

class SyntaxStudent extends Student {
	//@Override
	public void doHomework() {
		System.out.println("Student needs  to do homework");
	}
	
	@Override
	public void study() {
		System.out.println("Syntax Student need to study a lot");
	}
	@Override
	public void research() {
		System.out.println("Syntax Student needs  to do a lot of research");
	}
	@Override
	protected void attendClasses() {
		System.out.println("Syntax Student needs  to do ALL attend classes");
	}
	
	

}
