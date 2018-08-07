package JavaInterviewQuestions;

public class FindMissingNumArray {

	public static void main(String[] args) {
	/*
	 int a[] = {1,2,3,4,5} - sequence of number 
	 int a[] = {1,2,4,5} - Find the missing number from array
	 1+2+3+4+5 = 15
	 1+2+4+5 = 12
	 15-12 =3 
	 we can find the missing number from middle of the Array ,
	  Boundary values Ex: 1 & 5
	 */
	 int a[]= {-1,0,1,2,3,4,5,7,8,9,10};
	 int sum = 0;
	 //Calculate the sum of the numbers in the array
	 for(int i=0;i<a.length;i++) {
		 sum = sum+a[i];
		 }
	 System.out.println(sum);
	 
	 int sum1=0;
	 //Start the loop from starting of the boundary and verify till the boundary
	 for(int j=-1;j<=10;j++) {
		sum1=sum1+j;
	 }
	 System.out.println(sum1);
	 System.out.println("Missing number   ::"+(sum1-sum));
	}
 }
