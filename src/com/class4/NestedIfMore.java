package com.class4;

public class NestedIfMore {

	public static void main(String[] args) {
		
		int age=55;
		if(age<16) {
			System.out.println("you are too young to drive");	
		}else {
			System.out.println("you are eligible to drive");
		if (age>=18) {
				System.out.println("you can drive alone");
		}else {
				System.out.println("You need your parents to drive");
			}
		}
	



		/*we need to check if student completed the quiz 
		 * if yes good job, if not   not good
		 * if they completed we will check score
		 * if more than 90
		 * 
		 */
		boolean quiz=true;
		int score=89;
		
		if(quiz) {
			System.out.println("Good job");
			
			if (score>=90) {
				System.out.println("You got an A");
			}else if(score>80) {
				System.out.println("You got a B");
			}else if(score>70)	{
				System.out.println("You got a C");
		}else {
			System.out.println("not good");
				
			}
		}
		
	}
}

