package com.class33;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Recap1 {

	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int b=20;
		
		Student s1=new Student("Salim", 107);
		
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(new Student("Zeynep", 108));//eliminate step 
		//add   and create object together
		list.add(new Student("Hasan", 109));
		list.add(new Student("Jaime", 110));
		list.add(new Student("Esra", 11));
		list.add(new Student("Ozlem", 112));
		
		Iterator<Student> it=list.iterator();
		while(it.hasNext()) {
//			Student st=it.next();
//			System.out.println(st.studentId);
			
			it.next().display();
			
		}
	}


	}


