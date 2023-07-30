package stacks;

import java.util.Stack;

public class ReverseStack {
	public static void reverseStack(Stack<Integer> s, Stack<Integer> helper) {
		if(s.size() <= 1) {
			return;
		}
		int lastElement = s.pop(); // here we store the top most element 4 into "lastElement" variable
		reverseStack(s,helper); // recursion will happen in the remaining portion(3,2,1) after recursion we will get reverse of these elements that is 1,2,3
		while(! s.empty()) {
			int top = s.pop();//1,2,3
			helper.push(top);//[helper stack will be like(3,2,1) from top to bottom]
		}
		//after that original stack is empty now push the top most element into it which we store previously at line no 10
		s.push(lastElement);// now 4 is in originalStack
		while(! helper.empty()) {
			int top = helper.pop();
			s.push(top);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Stack<Integer> originalStack = new Stack<>();
		Stack<Integer> helper = new Stack<>();
		
		for(int elem: arr) {
			originalStack.push(elem);
		}
		
		reverseStack(originalStack,helper);
		
		
		while(! originalStack.empty()) {
			System.out.println(originalStack.pop());
		}

	}

}
