package com.class11;

public class TaskHW {

	public static void main(String[] args) {
		//Create a 2D array where you will store the following values:
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
        
		String[][] name={ {"Mr ","Mrs ","Ms ","Miss "},
        		{"Smith","Obama","Jackson","Jordan"}};
		
			
			System.out.println(name[0][0]+name[1][0]);
			System.out.println(name[0][1]+name[1][1]);
			System.out.println(name[0][2]+name[1][2]);
			System.out.println(name[0][3]+name[1][3]);
			System.out.println("*******************");
		
			//System.out.println();
			//task2
			//Create a 2D array that first row will contain 4 names and 
			//second row will contain grades. 
			//Then you program should print name of the students 
			//that has as an A and B grade
			
			String [][] names= {{"elif", "Ayse","Eda","Ali"},{"A","B","C","D"}};
			for (int i=0; i<names.length; i++) {
				for(int j=0; j<names[i].length; j++) {
					if ((names[i][j].equals("A"))||(names[i][j].equals("B"))){ 
						System.out.println(names[i-1][j]+"has "+names[i][j]+" grade");
						
					}else
						continue;
				}
			}
			
					
			

		//task3
		//Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array
		String [][] cars= {{"American ","German", "Korean", "italian"},
				{"Ford", "mercedes","kia","ferrari"}};
		
		
		for (int i=0; i<cars.length-1; i++ ) {
			for (int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" "+cars [i+1][j]);
				System.out.println();
			}
			System.out.println();
			
		}
        
		System.out.println("***********");
		
		//Create an array of countries: north america countries, south america countries, 
		//europe countries, asian countries, african countries. 
		//Then print all values from that array.
		String [] co= {"North America", "South America ","Europe countries","Asian countries","African Countries"};
		
		for (String getcountry:co) {
			System.out.println(getcountry);
		}			
		}

	}


