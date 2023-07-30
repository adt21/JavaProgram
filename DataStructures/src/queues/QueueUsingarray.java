package queues;

public class QueueUsingarray {
	
	private int data[];
	private int front; // index of element at the front of the queue
	private int rear; // index of element at the rear/end of the queue
	private int size;

	public QueueUsingarray() {
		data = new int[5];
		front = -1; // initially there was no element, if you set it as 0 then it sense that there was element at index 0
		rear = -1;
		size = 0;
	}
	// by default queue capacity is 5 as you declare it in constructor
	// but if someone want to decide it , that's why we create another constructor below where anyone can pass his capacity as he want
	
	public QueueUsingarray(int capacity) {
		data = new int[capacity];
		front = -1; 
		rear = -1;
		size = 0;
	}
	
	public int size() { //time complexity = O(1)
		return size;
	}
	public boolean isEmpty() { //time complexity = O(1)
		return size == 0; // it means if size == 0 then return true otherwise false
	}
	public void enqueue(int elem) { //time complexity = O(1)
		if(size == data.length) {
//			QueueFullException e = new QueueFullException();
//			throw e;
			doubleCapacity();
		}
		if(size == 0 || front == -1) {
			front++;
		}
		rear++;
		if(size == data.length) {
			rear = 0; // Check noteBook of DSA in Circular Queue
		}
		data[rear] = elem; // as element insert from the rear end
		size++;
	}
	private void doubleCapacity() { // time complexity of this = O(n)
		int temp[] = data;
		data = new int[2 * data.length];
		int index = 0;
		for(int i = front; i < temp.length; i++) { // copy the element from front index to temp.length
			data[index++] = temp[i];
		}
		for(int i = 0; i < front; i++) { // copy the element from the 0th index to front - 1
			data[index++] = temp[i];
		}
		front = 0;
		rear = temp.length - 1;
	}
	public int front() throws QueueEmptyException { //time complexity = O(1)
		if(size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		return data[front];
	}
	public int dequeue() throws QueueEmptyException { //time complexity = O(1)
		if(size == 0) {
			QueueEmptyException e = new QueueEmptyException();
			throw e;
		}
		int temp = data[front];
		front++;
		if(front == data.length) {
			front = 0;
		}
		size--;
		if(size == 0) { // suppose queue has 2 element (5 and 6) after deleting 6 it will be print again(as first) front and rear = -1;
			front = -1;
			rear = -1;
		}
		return temp;
	}
	
}
