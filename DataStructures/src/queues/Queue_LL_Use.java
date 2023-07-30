package queues;

public class Queue_LL_Use {

	public static void main(String[] args) {
		QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
		int arr[] = {10,20,30,40,80};
		for(int elem: arr) {
			queue.enqueue(elem);
		}
		while( ! queue.isempty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				
			}
		}

	}

}
