package com.class14;

public class StringMethodsRecap {

	public static void main(String[] args) {
		String str="your Syntax Technologies. is your place to study";
		System.out.println(str.replace('y','i'));
		
		System.out.println(str.replace("your","my"));
		
		//replaceAll
		String str2="Video provides a powerful way to help you "
				+ "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add.";
		System.out.println(str2.replaceAll("way(.*)", ""));
		
		String str3="2564Hel54$#@lo";
		System.out.println(str3.replaceAll("[0-9]", ""));
		System.out.println(str3.replaceAll("[^a-zA-Z0-9]", ""));
		
		//replacefirst
		System.out.println(str2.replaceFirst(" ", ""));

	}

}
