package binaryTrees;

public class BinaryTreeNode<T> { // make this class generic because you can store any kind of data here like string/integer etc
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}

}
