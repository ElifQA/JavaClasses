package com.class13;

public class AllStringMethod {

	public static void main(String[] args) {
		/*
         * str.isEmpty();
        str.length();
    str.toUpperCase();
    str.toLowerCase();
    str.equals();
    str.equalsIgnoreCase();
    str.contains(s);
    str.startsWith(String prefix);
    str.endsWith(String suffix);
    str.concat(String str);
    str.trim();
    str.charAt(int index);
    str.indexOf(int ch);
         */
		//this method returns a new string that is a substring of this string
		String str="Java is getting interesting";
		System.out.println(str.substring(10));
		
		//String substring (in beginindex
		System.out.println(str.substring(8,15));
		
		
		

	}

}
