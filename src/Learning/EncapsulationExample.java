package Learning;


/*Encapsulation
Encapsulation simply means binding object state(fields) and behavior(methods) together. 
If you are creating class, you are doing encapsulation.
 
 * So what is the benefit of encapsulation in java programming
Well, at some point of time, if you want to change the implementation details of the class EmployeeCount, 
you can freely do so without affecting the classes that are using it. */
	public class EncapsulationExample{
		
		 private int numOfEmployees = 0;
		   
		 public void setNoOfEmployees (int count)
		   {
		       numOfEmployees = count;
		   }
		   public double getNoOfEmployees () 
		   {
		       return numOfEmployees;
		   }
	   public static void main(String args[])
	   {
		   EncapsulationExample obj = new EncapsulationExample ();
	      
		   obj.setNoOfEmployees(5613);
	      System.out.println("No Of Employees: "+(int)obj.getNoOfEmployees());
	    }
	}

	
	
