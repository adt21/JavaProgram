package problems;

public class LLNode<T> {
	public T data;
	public LLNode<T> next;
	
	public LLNode() {
		
	}
	
	public LLNode(T data) {
		this.data = data;
		next = null;
	}
}
