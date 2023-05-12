package queues;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
	
	public static void reverseQueue(Queue<Integer> input) {
		if(input.size() == 0 || input.size() == 1) {
			return;
		}
		int temp = input.peek();
		input.remove();
		reverseQueue(input);
		input.add(temp);
	}
	public static void print(Queue<Integer> input) throws QueueEmptyException {
		if(input.isEmpty()) {
			throw new QueueEmptyException();
		}
		while(input.size() > 0) {
			System.out.println(input.peek() + " ");
			input.remove();
		}
	}

	public static void main(String[] args) throws QueueEmptyException {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		reverseQueue(queue);
		print(queue);
	}

}
