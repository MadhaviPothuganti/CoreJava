package Constructor;

public class A {
 private int i;
	public A() {
		System.out.println("Parent class constructor");
	}

	public A(int i) {
		System.out.println("Parent class constructor  " + i);
	}
    public int getNumber() {
    	return i;
    }
	public void setNumber(int i) {
		this.i = i;
	}
}

