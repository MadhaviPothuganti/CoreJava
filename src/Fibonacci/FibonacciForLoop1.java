package Fibonacci;

public class FibonacciForLoop1 {

	public static void main(String[] args) {
		
		int n1=0; int n2=1; int n3;  
		
		System.out.print(n1+" "+n2);
		
		for(int count=2;count<10;count++){
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
		}
		
		
	}

}
