package Collections;

public class SingleArray {

	public static void main(String[] args) {
		
		int student_id[] = new int[5];
		 
		
		int length = student_id.length;
		
		int i=0;
		System.out.println("student_id   " +student_id[0]);
		System.out.println("Array Length  " +length);
		
		/*for(int i=0;i<length;i++)
		{
			
			System.out.println("student_id   " +student_id[i]);
			
			
		}*/
		while( i<length){
			System.out.println("student_id   " +student_id[i]);
			i++;
		}
		
		
	}

}
