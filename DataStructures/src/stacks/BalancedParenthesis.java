package stacks;

import java.util.Stack;

public class BalancedParenthesis {
	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			char j = str.charAt(i);
			if(j == '[' || j == '{' || j == '(') {
				stack.push(j);
			}
			else if(j == ']' || j == '}' || j == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				else {
					if(j == ']') {
						if(stack.peek() != '[') {
							return false;
						}else {
							stack.pop();
						}
					}
					else if(j == '}') {
						if(stack.peek() != '{') {
							return false;
						}else {
							stack.pop();
						}
					}
					else if(j == ')') {
						if(stack.peek() != '(') {
							return false;
						}else {
							stack.pop();
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String str = "[{(a+b) + c*d }+(c+f)]";
		boolean b = isBalanced(str);
		System.out.println(b);
	}

}
