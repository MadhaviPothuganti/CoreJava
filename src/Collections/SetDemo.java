package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

     Set<String> values = new HashSet<>();
     values.add("Mithun");
     values.add("MyLi");
     values.add("xyz");
     values.add("abc");
     //Set doent maintain the insertion order, no index
     System.out.println("values  are" +values);
     
     //Converting set to List
     
     ArrayList<String> list = new ArrayList<>(values);
     System.out.println("values at specific index " +list.get(2));
     

	}

}
