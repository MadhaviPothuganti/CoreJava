package ClassObjects;

public class Website {

	String webName;
	int webAge;
	
	   Website(String name, int age){
	    	
		    this.webName = name;
	    	this.webAge = age;
	    }
		

	public static void main(String[] args) {
		
		Website site = new Website("Facebook", 10);
		Website site1 = new Website("Google", 15);
		
		System.out.println("Website name "+site.webName +" "+"Age " +site.webAge);
		System.out.println("Website name "+site1.webName +" "+"Age " +site1.webAge);
	 
		
	
	
	}

}
