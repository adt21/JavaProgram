package queues;

import linkedList.Node;

public class QueueUsingLinkedList<T> {
	private Node<T> front;
	private Node<T> rear;
	int size;
	
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public int size() { // time complexity = O(1)
		return size;
	}
	public boolean isempty() { // time complexity = O(1)
		return size == 0; // if size = 0 then return true otherwise return false
	}
	public void enqueue(T elem) { // time complexity = O(1)
		Node<T> newNode = new Node<>(elem);
		size++;
		if(front == null || rear == null) {
			front = newNode;
			rear = newNode;
		}else {
			rear.next = newNode;
			rear = newNode; // rear = rear.next;
		}
	}
	public T front() throws QueueEmptyException { // time complexity = O(1)
		if(front == null) {
			throw new QueueEmptyException();
		}
		return front.data;
	}
	public T dequeue() throws QueueEmptyException { // time complexity = O(1)
		if(front == null) {
			throw new QueueEmptyException();
		}
		T temp = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		size--;
		return temp;
	}

}
