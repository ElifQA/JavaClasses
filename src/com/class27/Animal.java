package com.class27;

public class Animal {
	 Animal(){
	        System.out.println("Animal constructor");
	    }
	    public static void whoAmI() {
	        System.out.println("I am an animal");
	    }
	    
	    public static void main(String[] args) {
	        Animal animal=new Animal();
	        
	    }
	}
	class Monkey extends Animal{
	    
	    Monkey(){
	        System.out.println("I am a child class constructor");
	    }
	    //cannot override static methods with instance methods
	    //  public void whoAmI() {
	    //      
	    //  }
	    //we cannot override static methods
	    // when both methods are static within Sub and Super class it is
	    //method hiding
	    public static void whoAmI() {
	        System.out.println("I am a monkey");
	    }
}
