package com.class22;

public class AccessingStaticVariables {

	public static void main(String[] args) {
		// create object want to access instance variable
		Husky obj=new Husky();
		
		System.out.println(obj.name);
		obj.name="Sharik";
		System.out.println(obj.name);
		
		
		System.out.println(Husky.breed);
		Husky.breed="New breed";//change static
		System.out.println(obj.breed);//possible not prefable

	}

}
