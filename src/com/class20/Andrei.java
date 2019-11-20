package com.class20;


import com.class20.MySonMath;
public class Andrei {
	
	public static void main(String[] args) {
		MySonMath elionSon = new MySonMath();

		elionSon.name = "Ali";
		//all of these variable are not visible by Andrei
//by Andrei
//		elionSon.phone = "";
//		elionSon.SSN = "";
//		elionSon.birthday ="";

		elionSon.add1();
		//all of these methods are not visible by Andrei
//		elionSon.add2(2, 3);
//		int result = elionSon.add3();
//		int result4 = elionSon.add4(5, 7);


	}

}
