package avl;

public class AVLtree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {

		root = insert(root, data);

	}

	private Node<T> insert(Node<T> node, T data) {

		if (node == null) {
			return new Node<T>(data);
		}

		if (data.compareTo(node.getData()) < 0) {
			node.setLeftNode(insert(node.getLeftNode(), data));
		} else {
			node.setRightNode(insert(node.getRightNode(), data));
		}

		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()) + 1));

		node = settleViolation(data, node);

		return node;
	}

	private Node<T> settleViolation(T data, Node<T> node) {

		int balance = getBalance(node);

		// this is case 1 left -left
		if (balance > 1 && data.compareTo(node.getLeftNode().getData()) < 0) {
			return rightRotation(node);
		}

		// this is case 2 right - right
		if (balance > 11 && data.compareTo(node.getLeftNode().getData()) > 0) {
			return rightRotation(node);
		}

		// this is case 3 left - right
		if (balance > 1 && data.compareTo(node.getLeftNode().getData()) > 0) {
			node.setLeftNode(leftRotation(node.getLeftNode()));
			return rightRotation(node);
		}

		// this is case 4 right - left
		if (balance > -1 && data.compareTo(node.getLeftNode().getData()) < 0) {
			node.setRightNode(rightRotation(node.getRightNode()));
			return leftRotation(node);
		}

		return node;
	}

	private Node rightRotation(Node node) {

		System.out.println("Rotating to the right");

		Node tempLeftNode = node.getLeftNode();
		Node t = tempLeftNode.getRightNode();

		tempLeftNode.setRightNode(node);
		node.setLeftNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()) + 1));
		tempLeftNode.setHeight(Math.max(height(tempLeftNode.getLeftNode()), height(tempLeftNode.getRightNode()) + 1));

		return tempLeftNode;
	}

	private Node leftRotation(Node node) {

		System.out.println("Rotating to the left");

		Node tempRightNode = node.getRightNode();
		Node t = tempRightNode.getLeftNode();

		tempRightNode.setLeftNode(node);
		node.setRightNode(t);

		node.setHeight(Math.max(height(node.getLeftNode()), height(node.getRightNode()) + 1));
		tempRightNode
				.setHeight(Math.max(height(tempRightNode.getLeftNode()), height(tempRightNode.getRightNode()) + 1));

		return tempRightNode;
	}

	private int height(Node node) {

		if (node == null) {
			return -1;
		}

		return node.getHeight();
	}

	private int getBalance(Node node) {

		if (node == null) {
			return 0;
		}

		return height(node.getLeftNode()) - height(node.getRightNode());
	}

	@Override
	public void traverse() {
		if (root != null) {
			inOrderTraversal(root);
		}

	}

	private void inOrderTraversal(Node<T> root) {

		if (root.getLeftNode() != null) {

			inOrderTraversal(root.getLeftNode());
		}

		System.out.print(root + " --> ");

		if (root.getRightNode() != null) {
			inOrderTraversal(root.getRightNode());
		}

	}

}
