package stacks;

public class StackUsingArrayUse {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		StackUsingArray stack = new StackUsingArray(100);
//		stack.data[1] = 100; we can't do it as stack is abstract we can't change the value of the stack so we need to private it
		int arr[] = {5,7,1,3,9};
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		stack.push(10);
		System.out.println(stack.top());
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		stack.pop();

	}

}
