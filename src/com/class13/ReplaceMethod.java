package com.class13;

public class ReplaceMethod {

	public static void main(String[] args) {
	/*replace
	 * this method returns a new string resulting 
	 * from replacing all occurrences of oldchar 
	 * in this string with newchar.
	 */
		String str="hello Dear Dan, how are you Dan?";
				System.out.println(str.replace('n', 'z'));
				String date="12-22-1990";
				System.out.println(date.replace('-','/'));
				
				System.out.println(str.replace("Dan",("Ben")));
				System.out.println(str.replaceFirst("Dan",("Ali")));
				System.out.println("**************");
				
				//replaceAll print only text and not numbers
				String str1="2586Hel56666lo5555";
		
				System.out.println(str1.replaceAll("[0-9]", ""));//leave only text
				System.out.println(str1.replaceAll("[a-zA-Z]", ""));//leave only numbers
				
				//remove everything except text and numbers
				//interview q how you get rid of all thing leave it only text
				String str2="Hi@!$&&g56kl*^";
				System.out.println(str2.replaceAll("[^a-zA-Z0-9]",""));
				System.out.println(str2.replaceAll("\\w",""));
				
				//replace with nothing
				String string="bug#&%$!!un disari cikt(*@!ik subwa15ye git8tik ";
				System.out.println(string.replaceAll("[^a-zA-Z]", ""));
				
				
				
				String sen="today is java class";
				System.out.println(sen.replaceAll("\\s", ""));
						
	}

}
