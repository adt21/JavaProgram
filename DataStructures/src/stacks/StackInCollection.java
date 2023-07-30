package stacks;

import java.util.Stack;

public class StackInCollection {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		int arr[] = {5,2,7,9,6};
		for(int elem: arr) {
			stack.push(elem);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.peek()); //name of the top() is peek here
//		System.out.println(stack.pop());
//		System.out.println(stack.isEmpty());

	}

}
