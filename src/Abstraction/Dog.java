package Abstraction;

public class Dog extends Animal {

	@Override
	public void animalSound() {
		System.out.println("woof");
		
	}

	public static void main(String args[]) {
		/*Dog d = new Dog();
		d.animalSound();*/
		Animal s = new Dog();
		s.animalSound();
	}
	
}
