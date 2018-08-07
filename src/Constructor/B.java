package Constructor;

public class B extends A {

	public B() {
		super(10);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {

		B obj1 = new B();
		A obj2 = new B();
		obj2.setNumber(100);
	System.out.println("values " +obj2.getNumber());
	}

}
