package Collections;

public class TwoDArray {

	public static void main(String[] args) {

		/*String student_name[][] = new String[2][2];
		student_name[0][0] = "Ryan";
		student_name[0][1] ="Dav";
		student_name[1][0] = "Emma";
		student_name[1][1] = "Gamma";

		int length = student_name.length;
		
		for(int row =0;row<length;row++) {
			
			   for(int col =0;col<student_name[row].length;col++) {
			
			    System.out.println("student_name  " +student_name[row][col]);
			
			   }
		 }*/
		String student_name[][] = new String[2][3];
		student_name[0][0] = "Ryan";
		student_name[0][1] ="Dav";
		student_name[0][2] = "Smith";
		student_name[1][0] = "Emma";
		student_name[1][1] = "Gamma";
		student_name[1][2] = "Sonia";

		int length = student_name.length;
		
	System.out.println(length);
	
		for(int row =0;row<length;row++) {
			
			   for(int col =0;col<student_name[row].length;col++) {
					System.out.println(student_name[row].length);
			    System.out.println("student_name  " +student_name[row][col]);
			
			   }
		 }
 		
	}

}
