package com.class27;

public class Examples {
	public String helloName(String str) {
		return str;
	}
	
	public String helloName(String str, String str2) {
		return str+" "+str2;
	}
}

class smallExample extends Examples{
	
	public String helloName(String str) {
		
		return "Hello "+str;
	}

}
