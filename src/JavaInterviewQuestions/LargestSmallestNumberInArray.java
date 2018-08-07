package JavaInterviewQuestions;

import java.util.Arrays;

public class LargestSmallestNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {10,24,-50,-88,98562,98569,0};
		int largest = numbers[0];
		int smallest = numbers[0];
		//Time complexity = 0(n)
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest =numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("\n given array is :"+Arrays.toString(numbers));
        System.out.println("Largest number is:"+largest);
        System.out.println("Smalest number is:"+smallest);
	}

}
