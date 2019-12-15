package com.class33;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CardTest {

	public static void main(String[] args) {
		List<Card> list=new LinkedList<>();
		//first way creating object
		Card card=new Visa("Chase");
		Master mc=new Master("master");
		
		//second way 
		list.add(new Visa(" Chase"));
		list.add(new Master(" Suntrust"));
		list.add(new Amex(" XYG"));
		System.out.println("______For Loop_______");
		for (int i=0; i<list.size(); i++) {
			list.get(i).openAccount();
			list.get(i).interestRate();
			list.get(i).transferFee(500);
		}
	
System.out.println("____For each Loop______");
	for (Card cc:list) {
		cc.openAccount();
		cc.interestRate();
		cc.transferFee(300);
	}
	System.out.println("______iterator________");
	Iterator <Card> it= list.iterator();
	while(it.hasNext()) {
		//it.next().openAccount(); //code will gave a exception as .next()
		//moves cursor to the 
		
		
		Card crd=it.next();
		crd.openAccount();
		crd.interestRate();
		crd.transferFee(2000);
	}

	}

}











