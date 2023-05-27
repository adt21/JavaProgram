package bst;

public class BstNode<T> {
	public int data;
	public BstNode<T> root;
	public BstNode<T> left;
	public BstNode<T> right;
	
	public BstNode(int data) {
		this.data = data;
	}
}
