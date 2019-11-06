package com.class10;

public class GetAllValues {

	public static void main(String[] args) {

		String[] animals = { "cat", "dog", "cow", "snake", "elephant" };
		int size = animals.length;
		for (int i = 0; i < animals.length; i++) {
			if (animals[i].equalsIgnoreCase("dog")) {
				System.out.println("I love dog");
			} else {
				System.out.println(animals[i]);
			}
		}
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		String[] countries = { "Turkey", "Japan", "USA" };

		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Turkey")) {
				System.out.println("Ankara");
			} else if (countries[i].equals("Japan")) {
				System.out.println("Tokyo");
			} else {
				System.out.println("Washington DC");
			}
		}
		//another way
		
		String[] country = { "Turkey", "Japan", "USA" };
		
		for(int i=0; i<country.length; i++) {
			switch (country[i]) {
			case "Turkey":
				System.out.println("Ankara");
	            break;	
			case "Japan":
				System.out.println("Tokyo");
				break;
			case "USA":
				System.out.println("Washington DC");
				break;
				default:
					System.out.println("unknown");
				
			}
			
		}
		
	}

}
