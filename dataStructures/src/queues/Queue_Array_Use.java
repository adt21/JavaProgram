package queues;

public class Queue_Array_Use {

	public static void main(String[] args) {
		QueueUsingarray queue = new QueueUsingarray(3);
		int arr[] = {10,20,30,40,50};
		for(int elem: arr) {
			//try {
				queue.enqueue(elem);
			//} catch (QueueFullException e) {
				//e.printStackTrace();
			//}
		}
		while(! queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
	}

}
