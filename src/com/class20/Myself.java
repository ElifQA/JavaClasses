package com.class20;

public class Myself {

	public static void main(String[] args) {
		MySonMath son0 = new MySonMath();
		son0.name = "Enes";
		son0.phone = "234-567-8900";
		son0.birthday = "05/05/2000";
		
		MySonMath son1 = new MySonMath();
		son1.name = "Ensar";
		son1.phone = "123-456-7890";
//		son1.SSN = "";
		son1.birthday = "01/01/2010";
		
		MySonMath daughter2 = new MySonMath();
		
		son1.add1();

		son1.add2(2, 3);

		int result = son1.add3();
		System.out.println(result);

		int result4 = son1.add4(5, 7);
		
//		son1.add5(); //This method is not visible

		Myself mySelf = new Myself();
		
		boolean good = mySelf.checkResult(12, result4);
		
		if (good) {
			System.out.println("Good job " + son1.name);
		} else {
			System.out.println("You are not good enough, but it's OK");
		}

	}

	boolean checkResult(int myResult, int mySonResult) {
		boolean isOK = false;

		if (myResult == mySonResult) {
			isOK = true;
		} else {
			isOK = false;
		}

		return isOK;

	}	
		
    

	

	
}
