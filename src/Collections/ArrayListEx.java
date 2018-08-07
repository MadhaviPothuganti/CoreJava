package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

		
	public static void main(String[] args) {
		
	ArrayList obj = new ArrayList();
	obj.add(514531234);
	obj.add("Madhoo");
	obj.add('M');
	
	
	
	
	//Prints all the objects
	System.out.println(obj);
	System.out.println(obj.get(2));//get the value of third Index
	for(int i =0;i<obj.size();i++) {
		
		System.out.println("Values from Array List  " +obj.get(i));
	
	}
	obj.remove(0);
	System.out.println(obj);
	
	
	//Enhanced for loop no need to assign the  size
	
	for(Object abc:obj) {
		
		System.out.println("Values   "  +abc);
		
	}
	
	//Iterator
	Iterator itr = obj.iterator();
		
	while(itr.hasNext()){
		
		Object value = itr.next();
		System.out.println("Values are " +value);
		
	}
	
	
	
	}

	
		
	}
		
	

	


