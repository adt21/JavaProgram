package Oops;
import java.util.Stack;
public class Stack_walmart {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		s.push("Hello");
		s.push("World");
//		s.pop();
//		s.pop();
		System.out.println(s.peek());
		System.out.println(s.capacity());

	}

}
