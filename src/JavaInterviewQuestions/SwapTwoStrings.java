package JavaInterviewQuestions;

public class SwapTwoStrings {

	public static void main(String[] args) {
		//SWAP two strings without using tem/third variable;
		
		String a = "Hellow";
		String b = "World";
		System.out.println("Before swapping: ");
		System.out.println("the value of a is :" +a);
		System.out.println("the value of b is :" +b);
		//1. append a and b
		a= a+b;//HelloWorld
		
		//2. Store initial string a in string b:
		b = a.substring(0, a.length()-b.length());//(starting index, ending index)
		
		//3. Store initial string b in Sting a:
		a=a.substring(b.length());
		System.out.println("the value of a and b after swaping"); 
		System.out.println("the value of a is :" +a);
		System.out.println("the value of b is :" +b);
		
	}

}
