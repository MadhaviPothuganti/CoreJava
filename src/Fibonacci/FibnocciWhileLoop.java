package Fibonacci;

public class FibnocciWhileLoop {
	 
	
	public static void main(String[] args) {
		int  a=0;
		int b=1;
		int c=0;
		System.out.print(a);
		while(c<90) {
			
			a=b;
			b=c;
			c = a+b;
	     System.out.print(" "+c);
		
		}	

	}

}
