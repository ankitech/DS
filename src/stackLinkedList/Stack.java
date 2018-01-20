package stackLinkedList;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> root;
	private int count;
	
	public void push(T newData)
	{
		this.count++;
		
		if(this.root == null)
		{
			this.root = new Node<>(newData);
		}
		else
		{
			Node<T> temp = this.root;
			this.root = new Node<>(newData);
			this.root.setNextNode(temp);
		}
	}
	
	public T pop()
	{
		T itemToPop = this.root.getData();
		this.root = this.root.getNextNode();
		this.count--;
		return itemToPop;
	}
	
	public int size()
	{
		return this.count;
	}

	public boolean isEmpty()
	{
		return this.root == null;
	}
}
