package Stack;

public class Runner {

	public static void main(String[] args) {
		Stack nums = new Stack();
		System.out.println("Empty "  +nums.isEmpty());
		nums.push(15);
		nums.push(8); //add to stack
		
		System.out.println("Number find: " +nums.peek());//find
		
		nums.push(10);
		nums.push(7);
		System.out.println("size is " +nums.size());
		
		System.out.println("Removed the number from stack:" +nums.pop());//remove
		nums.show();
		System.out.println("Empty "  +nums.isEmpty());
	}

}
