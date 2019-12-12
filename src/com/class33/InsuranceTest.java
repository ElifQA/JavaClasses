package com.class33;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {

	public static void main(String[] args) {
		ArrayList<Insurance> list=new ArrayList<>();
		Car car=new Car("Geico", "BMW");
		Pet pet=new Pet ("Paws Pet", "cat" );
		Health health=new Health("BlueCross");
		list.add(car);
		list.add(pet);
		list.add(health);
		
		for (int i=0; i<list.size(); i++) {
		list.get(i).getQuote();
		list.get(i).cancelInsurance();
		}
		System.out.println("---for advanced loop--------");
		 
		for (Insurance i:list) {
			 i.getQuote();
			 i.cancelInsurance();
			 
		 }
		System.out.println("-----Iterator----");
		Iterator <Insurance> it=list.iterator();
		while (it.hasNext()) {
			Insurance in=it.next();
			in.getQuote();
			in.cancelInsurance();
			
			
		}
	}

}
