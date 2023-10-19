package multithreading;

//This class is created for Synchronization and it is just like movie ticket booking case
//Please read notebook for understanding the movie ticket booking case
public class Stack {
	
	private int[] arr;
	private int stackTop;
	Object lock;
	
	public Stack(int capacity) {
		arr = new int[capacity];
		stackTop = -1;
		lock = new Object();
	}
	
	public synchronized boolean push(int element) {
		if(isFull()) {
			return false;
		}
		++stackTop;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		arr[stackTop] = element;
		return true;
	}
	public synchronized int pop() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		int obj = arr[stackTop];
		arr[stackTop] = Integer.MIN_VALUE;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		stackTop--;
		return obj;
	}
	
	public boolean isEmpty() {
		return stackTop < 0;
	}
	
	public boolean isFull() {
		return stackTop >= (arr.length - 1);
	}
}
