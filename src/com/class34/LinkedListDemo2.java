package com.class34;

import java.util.LinkedList;

class Sweets{
	String name;
	public Sweets(String name) {
		this.name=name;
	}
	public void iLove() {
		System.out.println("I love "+name);
	}
}
public class LinkedListDemo2 {

	public static void main(String[] args) {
	//create a list of sweets object
		LinkedList<Sweets> sweetList=new LinkedList<>();
		sweetList.add(new Sweets("Chocolota"));
		sweetList.add(new Sweets("Cake"));
		sweetList.add(new Sweets("Cookies"));
		sweetList.add(new Sweets("macarons"));
		//display name of each element
		
		for (Sweets element :sweetList) {
			System.out.println(element.name);
			element.iLove();
		}
		//retrieving 1 element and accessing method (2 steps)
				Sweets mySweet=sweetList.get(2);
				mySweet.iLove();
				
				//retrieving 1 element and accessing method (2 steps)
				sweetList.get(2).iLove();
				String nameOfTheSweet=sweetList.get(2).name;
				System.out.println(nameOfTheSweet);
				
				String str="Hello 123 ";
				//"Hello 123 "--> "Hello 456 " --> "Hello 456"
				str.replace("123", "456").trim();
				
				Integer num=100;
							//100--> "100"----> "200" ------>        3
				int newNumber=num.toString().replace("100", "200").length();
				System.out.println(newNumber);
				
			}}