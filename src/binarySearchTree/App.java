package binarySearchTree;

public class App {

	public static void main(String[] args) {
		
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		
		bst.insert(20);
		bst.insert(30);
		bst.insert(10);
		bst.insert(5);
		bst.insert(16);
		bst.insert(40);
		
		System.out.println("Minimum value : "+ bst.getMinValue());
		System.out.println("Maximum value : "+ bst.getMaxValue());
		
		bst.traverse();
		
		bst.delete(10);
		
		bst.traverse();
		
		BinarySearchTree<String> bst1 = new BinarySearchTree<>();
		
		bst1.insert("Ankit");
		bst1.insert("Prachi");
		bst1.insert("Prateek");
		bst1.insert("Vinit");
		bst1.insert("Sushree");
		bst1.insert("Abhinav");
		
		System.out.println("\nMinimum value : "+ bst1.getMinValue());
		System.out.println("Maximum value : "+ bst1.getMaxValue());
		
		bst1.traverse();
	}

}
