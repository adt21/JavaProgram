package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInCollection {

	public static void main(String[] args) {
		//queue is an interface and it does not create an object it just create reference;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue.size());
		System.out.println(queue.poll()); // poll() is similar to remove() just difference is remove() throws QueueEmptyException and poll() return null when queue is empty
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		
	}

}
