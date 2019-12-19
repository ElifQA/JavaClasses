package com.class36;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Car{

		String make, model;
		public Car(String make, String model) {
			this.make=make;
			this.model=model;
		}
		public void display() {
			System.out.println(make+" "+model);
		}

	}
		public class CarTest {
			
		public static void main(String[] args) {
			Map<Integer, Car> mapCar=new LinkedHashMap<>();
			mapCar.put(1, new Car("BMW", "X5"));
			mapCar.put(2, new Car("Tesla", "X5"));
			mapCar.put(3, new Car("Mercedes", "X5"));
			mapCar.put(4, new Car("Toyota", "X5"));
			mapCar.put(5, new Car("Honda", "civic"));
			mapCar.put(2, new Car("Lincoln", "Mkc"));
			System.out.println(mapCar.size());
			//display only value object
			
			Collection<Car> coll=mapCar.values();
			for (Car c:coll) {
				System.out.println(c.make+"--"+c.model);
				c.display();
			}
			//map key to its corresponding values (entrySet or keyset)
			Set<Entry<Integer, Car>> set=mapCar.entrySet();
			for (Entry<Integer,Car> ent:set) {
				Integer i=ent.getKey();
				Car c=ent.getValue();
				System.out.println("Key "+i+" is associated with value of  "+c.make);
			}
			//using keyset to map keys to values
			Set<Integer>keySet=mapCar.keySet();
			for(int key:keySet) {
		//System.out.println(key+"="+mapCar.get(key).make+"="+mapCar.get(key).model);
		Car car=mapCar.get(key);
		String carDetails=car.make+"-"+car.model;
		System.out.println(key+"="+carDetails);
			}
			//use Iterator to iterate through values keyset entryset
			Iterator<Entry<Integer, Car>> it=set.iterator();
			while(it.hasNext()) {
				Entry<Integer, Car>ent=it.next();
				String entry=ent.getKey()+"="+ent.getValue().make+" "+ent.getValue().model;
				System.out.println(entry);
				
			}
		}
	}




