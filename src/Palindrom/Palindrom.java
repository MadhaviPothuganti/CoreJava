package Palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		
	/*	//When reverse string it should get the same string ex: MoM, DAD, 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string to check if it is a palindrom");
		
		String str = scan.nextLine();
		String reverse = "";
		scan.close();
			
		for ( int i = str.length() - 1; i >= 0; i-- ) {
	         reverse +=  str.charAt(i);
	 
	    
	   }
		  if (reverse.equalsIgnoreCase(str)) {
		         System.out.println("Entered string is a palindrome.");
		  }  else {
		         System.out.println("Entered string isn't a palindrome.");
		 
	}*/
				
		Scanner scan = new Scanner(System.in);
	    System.out.println("Pls enter a String");
		String str = scan.nextLine();
		scan.close();
		int length = str.length();
		String reverse = "";
		for(int i = length-1;i>=0;i--) {
			reverse += str.charAt(i);
			System.out.println(reverse);
				}
	
		if(reverse.equalsIgnoreCase(str)) {
			System.out.println("Entered string is Palindrom");
		}else {
			System.out.println("Entered String is not Palindrom");
		}
			
		

   }
}

