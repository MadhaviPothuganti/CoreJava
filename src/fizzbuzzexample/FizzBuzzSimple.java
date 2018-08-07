package fizzbuzzexample;

public class FizzBuzzSimple {

	public static void main(String[] args) {
		for (int i=0;i<=100;i++) {
			if((i%15)==0) {
				System.out.println(i+" is FizzBuzz");
			}
			else if((i%3)==0) {
				System.out.println(i+ " is Fizz");
			}
			else if((i%5)==0) {
				System.out.println(i+" is Buzz");
			}
		}
	}

}
