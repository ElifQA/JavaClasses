package com.class17;

public class Dog {
	String breed, name,color;
	  void bark(){
	    System.out.println(breed+" can bark");
	  }
	  void run(){
	    System.out.println(breed+" can run ");
	    }
	  void play(){
	    System.out.println(breed+" can play");
	  }
	  public static void main(String[]args){
	  Dog dog=new Dog();
	  dog.breed="Husky";
	  dog.name="Rasco";
	  dog.color="black";
	  
	  Dog dog1=new Dog();
	  dog1.breed="Bulldog";
	  dog1.name="Bulut";
	  dog1.color="brown";
	  
	  Dog dog2=new Dog();
	  dog2.breed="Labrador";
	  dog2.name="co";
	  dog2.color="white";
	  
	  
	  dog.bark();
	  dog.run();
	  dog.play();
	  
	  dog1.bark();
	  dog1.run();
	  dog1.play();
	  
	  dog2.bark();
	  dog2.run();
	  dog2.play();

}}
