package JavaInterviewQuestions;

public class Singleton1 {
	public static Singleton1 singleton_instance;
	public String str;
	private Singleton1() {
		
	}
	public void start() {
		System.out.println("Machine started");
		str = "this is string";
	}
	public static Singleton1 getInstance() {
		if(singleton_instance==null) {
			singleton_instance = new Singleton1();
			
		}
		return singleton_instance;
	}

	public static void main(String[] args) {
		Singleton1 x = Singleton1.getInstance();
		Singleton1 y = Singleton1.getInstance();
		x.start();
		y.start();
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
	}

}
