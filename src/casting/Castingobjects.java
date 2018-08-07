package casting;

class Machine{
	public String start() {
		System.out.println("Machine started");
		return "Machine started";
	}
	public String stop() {
		System.out.println("Machine stoped");
		return "Machine stoped";
	}
	
	public String accelerate() {
		System.out.println("Machine accelerate");
		return "Machine accelerate";
	}
}

class Car extends Machine{
	public String start() {
		System.out.println("Car started");
		return "Car started";
	}
	public String stop() {
		System.out.println("Car stoped");
		return "Car stoped";
	}
		
}

public class Castingobjects {
 
	public static void main(String args[]) {
		
		Machine machine1 = new Machine();
		machine1.start();
		Car c = new Car();
		c.stop();
		c.start();
		
		System.out.println("****Polymorphism****");
		Car c1 = new Car();
		Machine machine2 = new Car();
		machine2.start();
		machine2.accelerate();
		
		System.out.println("****Downcasting****");
		//Machine machine3 = new Machine();
		//Car c3 = (Car)machine3;//converting machine to camera gives "ClassCast Exception
		Car c2 = new Car();
		Machine machine3 =c2;
		Car c3 = (Car)machine3;
		
		c3.accelerate();
		c3.start();
		c3.stop();
		System.out.println("****Downcasting1****");
		
		Machine machine4 = new Machine();
		Car c4 = (Car)machine4;
		c4.accelerate();
		
	}
	
	
}
