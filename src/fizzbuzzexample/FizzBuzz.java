package fizzbuzzexample;

public class FizzBuzz {

	
public static void main(String[] args) {
		
		for(int i=1;i<=100;i++) {
           
			if(fizzbuzz(i,15)==0) {
				
				System.out.println(i + " Number is FizzBuzz");
			}
			 else if(fizzbuzz(i,3)==0) {
					
					System.out.println(i + " Number is Fizz");
					
				}
             else if(fizzbuzz(i,5)==0) {
				
				System.out.println(i + " Number is Buzz");
				
			}
            
			
		}
		
	}
		
	
	static int fizzbuzz(int a, int b) {
		return a%b;
	}
	
}
