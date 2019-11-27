package com.class26_overridingexample;

public class FullTime extends Employee{
 int bonus;
 public void getPaid () {//overriding
	 System.out.println("Full time EMployee gets paid \"+salary+\" and bonus \"+bonus ");
 }
}
