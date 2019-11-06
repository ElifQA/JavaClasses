package com.class9;

public class NestedPyramid {

	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}	
		for (int i=9; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		//$repl
		int n = 4;
        for(int i = 0; i < n; i++){
           
           System.out.print('$');
            
            for(int j = 0; j < n-2; j++){
              if(i > 0 && i < n-1){
                System.out.print(" ");
              }
              else{
                System.out.print('$');
              }
          }
          System.out.println('$');
        }
	}

}
