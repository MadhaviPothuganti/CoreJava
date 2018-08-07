package Learning;

public class RemoveJunkString {

	public static void main(String[] args) {
		String s = "#$#$Selenium%$%242355";
		
		//Regular expression: [^a-zA-Z0-9]
		// kept only chars and numbers replaced the junk with space
		s= s.replaceAll("[^a-zA-Z0-9]","");
			System.out.println(s);	

	}

}
