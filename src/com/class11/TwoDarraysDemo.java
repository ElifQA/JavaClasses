package com.class11;

public class TwoDarraysDemo {

	public static void main(String[] args) {
		
		String [][] names= {
				{"Khan","Yosuf","Alex","zeynep"},
				{"elif","Ali","ann", "wegas"},
				{"Asim","melek","ayse","eda"},
		};
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfcols=names[1].length;
		System.out.println(lengthOfcols);
		System.out.println("**************************");
		for(String getArrays[]:names) {
			for (String getNames:getArrays) {
				System.out.print(getNames+" ");
			}
			System.out.println();
			
		
				
			}
		}
		}

	


