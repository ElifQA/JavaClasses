package com.class5;

public class LogicalAnd {

	public static void main(String[] args) {
		/*if number is between 1-10--this number is small
		 * "   "     "    "    10-100 this number is medium
		 *                     100-1000 this number is large
		 *  any number ----is out of the range                   
		 */
		int num=200;
		// true and false-->false
		if (num>1 && num<10) {
			System.out.println("this number is small");
			//true and false--->false
		}else if(num>=10 && num<100) {
			System.out.println("this number is medium");
			//true and true--->true
		}else if(num>=100 && num<1000) {
			System.out.println("this number is large");
		}else {
			System.out.println("Number is out of the range");
		}
		
	}

}
