package priorityQueues;

//here we used MIN HEAP

public class HeapSort {
	
	public static void downHeapify(int[] arr, int i, int n) { // i = start index, n = size of the heap
		
		int parentIndex = i;
		int leftChildIndex = 2*parentIndex + 1;
		int rightChildIndex = 2*parentIndex + 2;
		
		while(leftChildIndex < n) {
			int minIndex = parentIndex;
			if(arr[leftChildIndex] < arr[minIndex]) {
				minIndex = leftChildIndex;
			}
			
			if(rightChildIndex < n && arr[rightChildIndex] < arr[minIndex]) {
				minIndex = rightChildIndex;
			}
			
			if(minIndex == parentIndex) {
				return;
			}
			
			int temp = arr[parentIndex];
			arr[parentIndex] = arr[minIndex];
			arr[minIndex] = temp;
			parentIndex = minIndex;
			leftChildIndex = 2*parentIndex + 1;
			rightChildIndex = 2*parentIndex + 2;
		}
		
	}

	public static void heapSort(int[] arr) {
		
		//Build the Heap
		int n = arr.length;
		for(int i = (n/2) - 1; i >= 0; i--) {
			downHeapify(arr, i, n); // here we pass the array and starting index(n/2 - 1) and end index(n)
		}
		
		//remove the element from starting one by one and put them at the respective last position 
		
		for(int i = n-1; i >= 0; i--) {
			//swap
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			downHeapify(arr, 0, i);
			
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {4, 7, 3, 2, 8, 9, 6, 1};
		heapSort(arr);
		
		//just reverse the array as we used MIN heap, if you used max heap then you don't need to do this
		
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
