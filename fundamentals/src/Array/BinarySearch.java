package Array;

public class BinarySearch {
	public static int binarySearch(int arr[],int ele) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = (start + end)/2; // sometimes (start + end) exceeds integer range that's why it is better to write start + (end - start)/2 for finding mid
			if(arr[mid] > ele) {
				end = mid - 1;
			}
			else if(arr[mid] < ele) {
				start = mid + 1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,4,7,10,20,35,40};
		int index = binarySearch(arr,20);
		System.out.print("Index is" + " " + index);
	}

}

