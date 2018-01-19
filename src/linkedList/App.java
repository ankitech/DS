package linkedList;

public class App {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		
		list.insert(50);
		list.insert(34);
		list.insert(71);
		list.insert(65);
		list.insert(5);
		list.insert(91);
		
		System.out.println("\nSize of list : "+list.size());
		list.traverse();
		
		list.remove(91);
		
		System.out.println("\nSize of list : "+list.size());
		list.traverse();
		
		list.remove(50);
		System.out.println("\nSize of list : "+list.size());
		list.traverse();
		
		list.remove(65);
		System.out.println("\nSize of list : "+list.size());
		list.traverse();
	}
}
