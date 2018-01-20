package queue;

public class App {

	public static void main(String[] args) {
		
		
		Queue<Integer> myQueue = new Queue<>();
		
		myQueue.enqueue(10);
		System.out.println("sizs : "+myQueue.size());
		
		myQueue.enqueue(100);
		System.out.println("sizs : "+myQueue.size());
		
		myQueue.enqueue(1000);
		System.out.println("sizs : "+myQueue.size());
		
		System.out.println("dequeue : "+myQueue.dequeue());
		System.out.println("sizs : "+myQueue.size());
		
		System.out.println("dequeue : "+myQueue.dequeue());
		System.out.println("sizs : "+myQueue.size());
		
		System.out.println("dequeue : "+myQueue.dequeue());
		System.out.println("sizs : "+myQueue.size());
	}
}
