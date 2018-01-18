package linkedList;

import javax.swing.plaf.ActionMapUIResource;

public class LinkedList<T extends Comparable<T>> implements List<T>{

	private Node<T> root;
	private int sizeOfList;
	
	@Override
	public void insert(T data) {
		
		++sizeOfList;
		
		if(root == null)
		{
			this.root = new Node<>(data);
		}
		else
		{
			insertDataAtBeginning(data);
		}
		
	}

	private void insertDataAtBeginning(T data) {
		Node<T> node = new Node<>(data);
		node.setNextNode(root);
		this.root = node;
	}
	
	private void insertDataAtEnd(T data, Node<T> node)
	{
		if(node.getNextNode() != null)
		{
			insertDataAtEnd(data, node.getNextNode());
		}
		else
		{
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T dataToRemove) {
		
		if(this.root == null)
		{
			return;
		}
		
		--sizeOfList;
		
		if(this.root.getData().compareTo(dataToRemove) == 0)
		{
			this.root = this.root.getNextNode();
		}
		else
		{
			remove(dataToRemove,root, root.getNextNode());
		}
		
	}

	private void remove(T dataToRemove, Node<T> previousNode, Node<T> actualNode) {
		
		while(actualNode != null)
		{
			if(actualNode.getData().compareTo(dataToRemove) == 0)
			{
				previousNode.setNextNode(actualNode.getNextNode());
				actualNode = null;
				return;
			}
			previousNode = actualNode;
			actualNode = actualNode.getNextNode();
		}
		
	}

	@Override
	public void traverse() {
		
		if(this.root == null)
		{
			return;
		}
		
		Node<T> node = this.root;
		
		while(node != null)
		{
			System.out.println(node + " - ");
			node = node.getNextNode();
		}
		
	}

	@Override
	public int size() {
		return this.sizeOfList;
	}

}
