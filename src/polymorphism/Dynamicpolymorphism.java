package polymorphism;

public class Dynamicpolymorphism extends Animal{
	
	public void animalSound() {
		System.out.println("dog sound - woof");
	}
	
	public void start() {
		System.out.println("start");
	}

	public static void main(String[] args) {
		
		/*Dynamicpolymorphism a = new Dynamicpolymorphism();
		a.animalSound();*/
		Animal a = new Dynamicpolymorphism();
		a.animalSound();
		
	}

}
