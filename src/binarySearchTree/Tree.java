package binarySearchTree;

public interface Tree<T> {
	
	public void insert(T data);
	public T getMaxValue();
	public T getMinValue();
	public void traverse();
	public void delete(T data);
}
