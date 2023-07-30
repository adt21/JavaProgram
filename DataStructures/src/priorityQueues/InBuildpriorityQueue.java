package priorityQueues;

import java.util.PriorityQueue;

public class InBuildpriorityQueue {

	public static void main(String[] args) {
		int arr[] = {4, 7, 3, 2, 8, 9, 6, 1};
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // by default it is MIN Priority queue
		
		//poll() and element() both are used for removing element but 
		//poll() return null if no value is there and element() return exception for that
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		
		//System.out.println(pq.peek());
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.poll();
		}
	}

}
