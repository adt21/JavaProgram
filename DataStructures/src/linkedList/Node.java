package linkedList;

public class Node<T> {
	
	public T data; // data of the node
	public Node<T> next;
	/*
	 * next is address of the next node and If you declare a variable using the name of a class for its type
	 * that variable can contain a reference to an object of that class
	 */
	public Node(T data){
		this.data = data;
//		next = null; Default value of any reference in an object is null so no need to write it
	}
}
