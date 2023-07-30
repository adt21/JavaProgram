package stacks;

public class StackUsingArray {
	
	private int data[];
	private int topIndex;
	
	public StackUsingArray() {
		data = new int[10];
		topIndex = -1; //index of the top most element of the stack
	}
	public StackUsingArray(int size) {
		data = new int[10];
		topIndex = -1; //index of the top most element of the stack
	}
	public int size() { // time complexity O(1)
		return topIndex + 1;
	}
	public boolean isEmpty() { // time complexity O(1)
		if(topIndex == -1) {
			return true;
		}else {
			return false;
		}
	}
	public void push(int element) throws StackFullException { // time complexity O(1)
		//if stack is full
		if(topIndex == data.length-1) {
			//you don't have any space to insert , so Throw Exception
			StackFullException e = new StackFullException();
			throw e;
		}
		topIndex++;
		data[topIndex] = element;
	}
	
	public int top() throws StackEmptyException { // time complexity O(1)
		if(topIndex == -1) {
			//if stack is empty then return StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[topIndex];
	}
	
	public int pop() throws StackEmptyException { // time complexity O(1)
		if(topIndex == -1) {
			//if stack is empty then return StackEmptyException
			StackEmptyException e = new StackEmptyException();
			throw e;			
	}
		int temp = data[topIndex];
		topIndex--;
		return temp;
  }
}

