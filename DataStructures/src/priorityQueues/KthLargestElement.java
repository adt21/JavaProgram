package priorityQueues;

import java.util.PriorityQueue;

/*
 * Here you have to find first kth element , like if the array be like - {3,8,2,9,6,5} and k = 4
 * then ans will be 9, 8, 6, 5 (1st 4 largest no).
 * To do it 1st take the  first k element and consider them as largest, then after taking this kth element
 * compare this element with remaining element. Find the smallest element among those k element 
 * and then if smallest element < comparing element then replace it with the smallest
 * like take (3, 8, 2, 9) here smallest is 2 , now compare this with remaining element 6 , as 6>2
 * now replace 2 with 6, in this way again find the smallest then compare it with another remaining element
 * (3, 8, 2, 9) --> (3, 8, 6, 9) --> (5, 8, 6, 9)
 * 
 * ***You Can also do this in this way like 1st sorted the array, then last largest kth elements are answer
 */
public class KthLargestElement {
	
	public static void printKLargest(int[] arr, int k) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for(int i = k; i < arr.length; i++) {
			if(pq.peek() < arr[i]) {
				pq.poll();
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {3, 8, 2, 9, 6, 5};
		int k = 4;
		printKLargest(arr, k);

	}

}
//time complexity = O(n(logk)) and space complexity = O(k)
