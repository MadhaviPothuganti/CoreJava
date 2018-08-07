package ConstructorEx;

public class ConstructorExample1 {

		int age;
		String name;
		
	public	ConstructorExample1 (){
			
		this.age=30;
		this.name = "Nidhi";
		}
    public ConstructorExample1(int a, String n) {
    	this.age= a;
    	this.name= n;
    	
    }
	
public static void main(String[] args) {
	ConstructorExample1 con1 = new ConstructorExample1();
	ConstructorExample1 con2 = new ConstructorExample1(30,"Madhoo");
	System.out.println("name and age are " +con1.age +" " +con1.name);
	System.out.println("name and age are " +con2.age +" " +con2.name);
}
}