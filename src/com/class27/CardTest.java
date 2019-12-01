package com.class27;

import java.util.Scanner;

public class CardTest {

	public static void main(String[] args) {
		//primitive
		int i=10;
		//non primitive
		String str="Heello";
		Scanner scan;
		MC mc;
		//take an Object of the child class and give reference to the parent
		//type reference variable= object is created
		Card card=new AX();
		card.creditLimit();
		
		Card card1=new MC();
		card1.creditLimit();
		
		Card card2=new Visa();
		card2.creditLimit();
		
		//type [] arrayName={};
		//type [] arrayName=new type[];
		int[] numArray= {10,12,13};
		String[] stringArray= {"aa", "bb"};
		//1 we crated objects and assigned to the variables and then
		//stored those variables inside the array
		Card[] cardArray= {card, card1, card2};
		
		//creating an object and storing it directly into an Array of Cards
		Card[] cardArray1= {new MC(), new AX(), new Visa(), new Discovery()};
		System.out.println("----------------");
		//cardArray[0]--> MC
		//cardArray[3]--> Discovery
		
		for(Card myCard:cardArray1) {
			myCard.chargeInterest();
			myCard.creditLimit();
		}
		
		for(int y=0; y<cardArray1.length; y++) {
			cardArray1[y].creditLimit();
		}
		
		Card c1=new Card();
		c1.chargeInterest();
		c1.creditLimit();
		
		AX ax1=new AX();
		ax1.chargeInterest();
		ax1.creditLimit();
		
		MC mc1=new MC();
		mc1.cashBack();
		mc1.chargeInterest();
		mc1.creditLimit();
		
		MC mc2=new MC();
		MC mc3=new MC();
		
		Card cc=new MC();
		cc.chargeInterest();
		cc.creditLimit();
		
		
		MC[] masterCards= {mc1,mc2,mc3};
		for(MC mCard:masterCards) {
			mCard.cashBack();
			mCard.chargeInterest();
			mCard.creditLimit();
		}}}
