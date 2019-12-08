package com.class29;

public abstract class Phone {
	//implemented methods
	public void makeCall() {
		System.out.println("make call");
	}
	public void sendText() {
		System.out.println("Send text");
	}
	//unimplemented methods no body no curly bracet
	public abstract void takePictures();
	public abstract void playGames();
}
//concrete class
class iPhone extends Phone{
	@Override
	public void takePictures(){
		System.out.println("iphone take pictures");
	}
	@Override
	public void playGames() {
	System.out.println("Play games on iphone"); 
	
}
}