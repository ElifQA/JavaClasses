package com.class8;

public class ForLoopTask {

	public static void main(String[] args) {
	
		//write a code to find the sum of even& odd numbers
        //from range 1 to 20
        //expecting 2 outputs
        // sum for odd nums=....
        //sum for even nums=....
        
		
		
		
		
		
        //1st way
        int sumEven=0;
        for(int i=2; i<=20; i+=2) {
            sumEven=sumEven+i;
        }
        System.out.println(sumEven);
        //odd
        int sumOdd=0;
        for(int y=1; y<=19; y+=2) {
            sumOdd=sumOdd+y;
        }
        System.out.println(sumOdd);
        
        //2nd way;
        
        int sumEven1=0;
        int sumOdd1=0;
        for(int i=1; i<=20; i++) {
        if(i%2==0) {
            sumEven1=sumEven1+i;
            }else {
                sumOdd1=sumOdd1+i;
            }
        }
        System.out.println("The total of all even#="+sumEven1);
        System.out.println("The total of all odd#="+sumOdd1);
	}

}
