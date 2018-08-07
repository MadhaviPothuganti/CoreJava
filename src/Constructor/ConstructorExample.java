package Constructor;

public class ConstructorExample {
	/*Constructor looks like a method but it is in fact not a method.
	It’s name is same as class name and it does not return any value.
	they are used to communicate between the objects*/

       int age;
	   String name;
		
	   //Default constructor
	   ConstructorExample(){
		this.name="Chaitanya";
		this.age=30;
	   }
		
	   //Parameterized constructor
	   ConstructorExample(String n,int a){
		this.name=n;
		this.age=a;
	   }
	   public static void main(String args[]){
		ConstructorExample obj1 = new ConstructorExample();
		ConstructorExample obj2 = 
			       new ConstructorExample("Steve", 56);
		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
	   }
}
