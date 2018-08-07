package String;

public class StringCompare {

	public static void main(String[] args) {
		
		String actual = "Welcome to Selenium WebDriver World";
		String expected = "Welcome to Selenium  World";
		
		String name1 = "Welcome to Selenium ";
		String name2 = "welcome to selenium ";
		
		boolean status = actual.contains("Selenium");
		System.out.println("Status is  " +status );
		
		boolean status1 = actual.equals(expected);
		System.out.println("Status is  " +status1 );
		
		boolean status2 = name1.equalsIgnoreCase(name2);
		System.out.println("Status is  " +status2 );
		     
		          
	}

}
