package com.class8;

public class ForLoopEx {

	public static void main(String[] args) {
		//what is the out put
		int sum=0;
		for (int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.print(sum+ " + ");
		}
		System.out.println();
		System.out.println(sum);
		
		//what is the output
		int sumAll=0;
		for (int i =0; i<=20; i+=5) {//0+0=0+5=5+10=15+15=30+20=50
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		
		//what is the output
		int total=2;
		
		for (int y=1; y<=3; y++) {
			total=total*y;//2=2*1; 4=2*2; 12=4*3
		}
		System.out.println(total);
		System.out.println("****************************************");
		/*write code to find the sum of even and odd numbers
		 * from range 1 to20
		 * expecting 2 outputs
		 * sum for odd nums=..
		 * sum for even nums=..
		 */
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=20; i++) {
			if (i%2==0) {
				sumEven=sumEven+i;
			
		}else {
			sumOdd=sumOdd+i;
		}
		}
		System.out.println("the total even "+ sumEven);
		System.out.println("the tootal of all odd "+ sumOdd);
		}
		
		
	}

		
		
		
		
		
		
		
	
	
	


