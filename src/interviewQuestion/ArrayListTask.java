package interviewQuestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTask {


		public static void main(String[] args) {
			//create an array list of cars and retrieve all the 
			//value using 3 different ways
			
			ArrayList<String> list=new ArrayList<>();
			list.add("BMW");
			list.add("toyota");
			list.add("hello");
			
			for (String c:list) {
				System.out.println(c);
			}
			for (int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
			
			Iterator<String> it=list.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
			
			Iterator<String> its=list.iterator();
			
			while(its.hasNext()) {
				if (its.next().contains("a")) {
					its.remove();
			}}
				System.out.println(list);
				/*
				 * Create an arrayList of drinks. 
				 * If any drink has letter “a” or “e” replace it with water. 
				 */
		for (int a=0; a<list.size(); a++) {
			if (list.get(a).contains("a") || list.get(a).contains("e") ){
				list.set(a, "water");
				
			}
			System.out.println(list);
		}
		/*Create an arrayList of even numbers from 1 to 50. 
		 * Using Iterator remove any number that is divisible 
		 * by 5 from that arrayList. * 
		 */
		
		List<Integer> llist=new ArrayList<>();
		for (int j=1; j<=50; j++) {
			if (j%2==0) {
				llist.add(j);
			}
		}
		System.out.println(llist);
		
		Iterator<Integer> number=llist.iterator();
		while(number.hasNext()) {
			if(number.next()%5==0){
				number.remove();
				
				
			}
		}
		System.out.println(llist);
			
	}

}
