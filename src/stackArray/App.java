package stackArray;

public class App {

	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<>();
		
		myStack.push(10);
		System.out.println("size of stack : "+myStack.size());
		
		myStack.push(100);
		System.out.println("size of stack : "+myStack.size());
		
		myStack.push(1000);
		System.out.println("size of stack : "+myStack.size());
		
		System.out.println("pop : "+myStack.pop());
		System.out.println("size of stack : "+myStack.size());
		
		System.out.println("pop : "+myStack.pop());
		System.out.println("size of stack : "+myStack.size());
		
		System.out.println("pop : "+myStack.pop());
		System.out.println("size of stack : "+myStack.size());
	}
}
