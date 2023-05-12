package stacks;

import java.util.*;

public class StackUsing2Queues<T> {
	Queue<T> q1;
	Queue<T> q2;
	int size;
	
	public StackUsing2Queues() {
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
		size = 0;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void push(T elem) {		
		q1.add(elem);
		size++;
	}
	public T pop() throws StackEmptyException {
		if(q1.isEmpty()) {
			throw new StackEmptyException();
		}
		while(q1.size() != 1) {
			q2.add(q1.poll());
		}
		T ans = q1.poll();
		while( ! q2.isEmpty()) {
			q1.add(q2.poll());
		}
		size--;
		return ans;
	}
	public T top() throws StackEmptyException {
		if(q1.isEmpty()) {
			throw new StackEmptyException();
		}
		while(q1.size() != 1) {
			q2.add(q1.poll());
		}
		T ans = q1.poll();
		
		while( ! q2.isEmpty()) {
			q1.add(q2.poll());
		}
		q1.add(ans);
		
		return ans;
	}
	
}
