package Fibonacci;

import java.util.Scanner;

public class fib {

	static int n1=0, n2=1, n3;
	static Scanner scan = new Scanner(System.in);
	static int count = scan.nextInt();
	public static void main(String[] args) {
		System.out.print(n1);
		while(n3<count) {
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
			System.out.print(" "+n3);			
			
			
		}

	}

}
