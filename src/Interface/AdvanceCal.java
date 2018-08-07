package Interface;

public class AdvanceCal implements Cal {

	public static void main(String[] args) {
		
		/*1.Child class reference and child class object –
		This will allow to access all the methods of base class and child class*/
		AdvanceCal  obj1 = new AdvanceCal();
		System.out.println("Printing Child class methods");
		obj1.add();
		obj1.sub();
		obj1.calculatesin();
		
		
		/*2.•	Reference of base class and object of child class –
		 *  This will allow to access only the base class methods
		 
		 */
		System.out.println("*************");
		Cal obj2 = new AdvanceCal();
		System.out.println("Printing Parent class methods");
		obj2.add();
		obj2.sub();
		
		
		
	}
  
	
	public void calculatesin() {
		System.out.println("I am calculate sintheta method");
	}
	
	public void add() {
		System.out.println("I am in Add Method");
	}

	
	public void sub() {
		System.out.println("I am in Sub Method");
	}

}
