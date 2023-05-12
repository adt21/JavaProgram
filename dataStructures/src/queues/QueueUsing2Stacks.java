package queues;

import java.util.Stack;

public class QueueUsing2Stacks<T> {
	
	Stack<T> s1;
	Stack<T> s2;
	int size;
	public QueueUsing2Stacks(){
		s1 = new Stack<>();
		s2 = new Stack<>();
		size = 0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public void enqueue(T elem) {
		s1.push(elem);
		size++;
	}
	public T deque() throws QueueEmptyException {
		if(s1.isEmpty()) {
			throw new QueueEmptyException();
		}
		while(s1.size() != 1) {
			s2.push(s1.pop()); // pop all element except 1st inserted element from s1 then push these into s2
		}
		
		T ans = s1.pop(); // pop remaining 1st element(which is front element of queue) and store it into a variable
		
		while( ! s2.isEmpty()) {
			s1.push(s2.pop());// now pop the elements from s2 and then again push back into s1
		}
		size--;
		return ans;
	}
	public T front() throws QueueEmptyException {
		if(s1.isEmpty()) {
			throw new QueueEmptyException();
		}
		while( ! s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T top = s2.peek();
		while(! s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return top;
	}
}
