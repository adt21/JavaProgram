package stacks;

public class StackDoubleCapacity {
	private int[] data;
	private int topIndex;
	
	public StackDoubleCapacity() {
		data = new int[2];
		topIndex = -1;
	}
	
	public int size() {
		return topIndex + 1;
		
	}
	public boolean isEmpty() {
		if(topIndex == -1) {
			return true;
		}else {
			return false;
		}
		
	}
	public void push(int elem) {
		if(topIndex == data.length-1) {
			doubleCapacity();
		}
		topIndex++;
		data[topIndex] = elem;
	}

	private void doubleCapacity() {
		System.out.println("Double Capacity");
		int[] temp = data;// now temp variable length is 2
		data = new int[2 * data.length]; // here length of the data = (2 * 2) = 4
		for(int i = 0; i < temp.length; i++) { // it is written here i < temp.length means i < length of 2 because to copy the previous element of the data(which is now) array to the double size new data array
			
			data[i] = temp[i]; // here just copy the previous element from the 1st array to double size array
		}
	}
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[topIndex];
	}
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		int temp= data[topIndex];
		topIndex--;
		return temp;
	}
}
