package com.class25_1;

public class ConstructorOverloading {
	  // having different amount of parameters
    ConstructorOverloading (){
        System.out.println("I am non argument constructor");
    }
    
    ConstructorOverloading(String str){
        System.out.println("I am  constructor with 1 String parameter");
    }
    // having different type of parameters
    ConstructorOverloading(int num){
        System.out.println("I am  constructor with 1 String parameter");
    }
}
