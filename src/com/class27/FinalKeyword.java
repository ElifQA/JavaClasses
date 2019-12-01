package com.class27;

public class FinalKeyword {
	public static void main(String[] args) {
        // final keyword with variables:
        String str = "I am awesome";
        str = "I am cool";
        System.out.println(str);
        final String finalString = "Java is easy";
        //finalString="Java is hard";
        final int age = 12;
        // age=100;
        int a = 4;
        a = 7;
        // final int a=9;
    }
    // final keyword with methods:
    public final void hello() {
        System.out.println("I am final method in Parent class");
    }
    // We can override the final method no
    public final void hello(int num) {
        System.out.println("I am final method in Parent class with " + num);
    }
}
class FinalKeywordChild extends FinalKeyword {
    // we cannot overridden final methods, we will get Compiler error
    // public final void hello() {
    // System.out.println();
    // }
}
