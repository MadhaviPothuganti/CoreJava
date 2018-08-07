package overridingConcept;

public class Demo extends ABC {

	public void disp() {
		System.out.println("This is the child disply method");
	}
	public void cal() {
		System.out.println("This is the child cal() ");
	}
	
	
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.disp();
		
		ABC obj1 = new Demo();
		obj1.disp();
		obj1.print();
		//obj1.cal(); it is not valid
	}

}
