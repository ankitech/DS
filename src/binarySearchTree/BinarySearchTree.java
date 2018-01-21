package binarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {
		if (root == null) {
			root = new Node<T>(data);
		} else {
			insertNode(data, root);
		}
	}

	@Override
	public T getMinValue() {

		if (root == null) {
			return null;
		}

		return getMin(root);
	}

	@Override
	public T getMaxValue() {

		if (root == null) {
			return null;
		}

		return getMax(root);
	}

	@Override
	public void traverse() {

		if (root != null) {
			inOrderTraversal(root);
		}

	}

	@Override
	public void delete(T data) {

		if (root != null) {
			root = deleteNode(data, root);
		}
	}

	private void insertNode(T newData, Node<T> node) {

		if (newData.compareTo(node.getData()) < 0) {

			if (node.getLeftNode() != null) {
				insertNode(newData, node.getLeftNode());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setLeftNode(newNode);
			}
		} else {
			if (node.getRightNode() != null) {
				insertNode(newData, node.getRightNode());
			} else {
				Node<T> newNode = new Node<T>(newData);
				node.setRightNode(newNode);
			}
		}

	}

	private T getMax(Node<T> node) {
		if (node.getRightNode() != null) {
			return getMax(node.getRightNode());
		}

		return node.getData();
	}

	private T getMin(Node<T> node) {

		if (node.getLeftNode() != null) {
			return getMin(node.getLeftNode());
		}

		return node.getData();
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

	private Node<T> deleteNode(T data, Node<T> node) {

		if (node == null) {
			return node;
		}

		if (data.compareTo(node.getData()) < 0) {
			node.setLeftNode(deleteNode(data, node.getLeftNode()));
		} else if (data.compareTo(node.getData()) > 0) {
			node.setRightNode(deleteNode(data, node.getRightNode()));
		} else {

			// found the node to be deleted

			if (node.getLeftNode() == null && node.getRightNode() == null) {
				System.out.println("Removing leaf node");
				return null;
			}

			if (node.getLeftNode() == null) {
				System.out.println("removing single right child");
				Node<T> tempNode = node.getRightNode();
				node = null;
				return tempNode;
			}

			if (node.getRightNode() == null) {
				System.out.println("removing singlr left child");
				Node<T> tempNode = node.getLeftNode();
				node = null;
				return tempNode;
			}

			System.out.println("Removing node with both child");
			Node<T> tempNode = getPredecessor(node.getLeftNode());

			node.setData(tempNode.getData());
			node.setLeftNode(deleteNode(tempNode.getData(), node.getLeftNode()));
		}
		return node;
	}

	private Node<T> getPredecessor(Node<T> node) {

		if (node.getRightNode() != null) {
			return getPredecessor(node.getRightNode());
			
		}
		System.out.println("Predecessor is: "+node);
		return node;
	}
}
