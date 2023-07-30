package queues;

public class QueueUsingStacksUse {

	public static void main(String[] args) throws QueueEmptyException {
		QueueUsing2Stacks<Integer> q = new QueueUsing2Stacks<>();
		int arr[] = {10,20,30,40};
		
		for(int elem: arr) {
			q.enqueue(elem);
		}
		
		while( ! q.isEmpty()) {
			System.out.println(q.deque());
		}

	}

}
