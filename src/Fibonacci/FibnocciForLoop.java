package Fibonacci;

public class FibnocciForLoop {

	public static void main(String[] args) {
		int n1=0;
        int n2=1;
        int n3;
       
        System.out.print(n1+" "+n2);
        for ( n3= 0;n3<20; n3++) {
        	
        	n3=n1+n2;
        	n1=n2;
        	n2=n3;
        	
        	System.out.print(" "+n3);
        	
        	
        	
        			
        	
        }

	}

}
