package queue;

public class Queue<T extends Comparable<T>> {

	private Node<T> firstNode;
	private Node<T> lastNode;
	private int size;

	public boolean isEmpty() {
		return firstNode == null;
	}

	public int size() {
		return this.size;
	}

	public void enqueue(T newData) {
		this.size++;

		Node<T> oldLastNode = this.lastNode;
		this.lastNode = new Node<>(newData);
		this.lastNode.setNextNode(null);

		if (isEmpty()) {
			this.firstNode = this.lastNode;
		}
		else {
			oldLastNode.setNextNode(this.lastNode);
		}
	}
	
	public T dequeue()
	{
		this.size--;
		
		T nodeToReturn = this.firstNode.getData();
		
		this.firstNode = this.firstNode.getNextNode();
		
		if(isEmpty()) {
			this.lastNode = null;
		}
		
		return nodeToReturn;
	}

}
