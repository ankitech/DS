package avl;

public class App {

	public static void main(String[] args) {
		
		
		Tree<Integer> avl = new AVLtree<>();
		
		avl.insert(10);
		avl.insert(20);
		avl.insert(30);
		
		avl.traverse();

	}

}
