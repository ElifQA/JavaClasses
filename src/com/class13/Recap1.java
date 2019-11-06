package com.class13;

public class Recap1 {

	public static void main(String[] args) {
		String a ="Hello";
        String b ="Hello";
        
        System.out.println(a.contentEquals(b));
        System.out.println(a==b);
        
        String x = new String ("Bye");
        String y = new String ("Bye");
        
        System.out.println(x.contentEquals(y));
        System.out.println(x==y);
        
        
        /*    .equals : compares the values (are both of them have the same sequence of char? )
         *    ==   : compares the objects   (are these same objects? )
         *
         */
        String str1="Hello";
        String str2="Hello";
        
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1==str2);
        
        
        String str3=new String("Bye");
        String str4=new String("Bye");
                
        System.out.println();
        
        System.out.println(str3.equals(str4));//true
        System.out.println(str3==str4);
        //System.out.println(“==============“);
        System.out.println(str1.contains("zz"));
        
        System.out.println("=======StartsWith and EndsWith=======");
        String str5="Today is Saturday";
        System.out.println(str5.startsWith("Today"));
        System.out.println(str5.endsWith("day"));
        
        //System.out.println(“=======Concat=======“);
        System.out.println(str5.concat(" and we have java class"));
         
        
        System.out.println("=======trime=======");
        String str6="   It is sunny    ";
        System.out.println("Before triming: "+str6);
        System.out.println(str6.trim());
        
        System.out.println("=======Index OF and CharAt=======");
        String str7="Tomorrow we will be done with String Manipulation";
        
        System.out.println(str7.indexOf('e'));
        System.out.println(str7.indexOf('e', 11));
        System.out.println(str7.indexOf("we"));
        
        System.out.println(str7.charAt(10));
        
        
        
        
        
    }

	}


