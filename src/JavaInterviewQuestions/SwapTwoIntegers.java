package JavaInterviewQuestions;

public class SwapTwoIntegers {

	public static void main(String[] args) {
		
		int x= 5;//bitwise 0101
		int y = 10;//1010
		int temp;
		//1.with using third variable
		temp = x;//5
		x= y;//10
		y = temp;//5
		System.out.println("values of X is " +x);
		System.out.println("values of y is " +y);
		System.out.println("**********");
		//2. Swap without using temp variable & using+operator
		x= x+y;//15
		y = x-y;//5
		x= x-y;//10
		System.out.println("values of X is " +x);
		System.out.println("values of y is " +y);
		//3. Swap without using temp variable & using * operator
		System.out.println("**********");
		x= x*y;//50
		y=x/y; //5
		x=x/y;//10
		System.out.println("values of X is " +x);
		System.out.println("values of y is " +y);
		System.out.println("**********");
		//4.using XOR ^, Bitwise operator
		x = x^y; //15--->1111
		y = x^y;//10 ---> 1010
		x = x^y; //5 --->0101
		System.out.println("values of X is " +x);
		System.out.println("values of y is " +y);

	}

}
