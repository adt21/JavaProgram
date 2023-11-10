package arrays;

public class SearchElement {
	
	public static int search(int arr[], int start, int end, int x) {
		if(start > end) {
			return -1;
		}
		int midIndex = start + (end-start)/2;
		if(arr[midIndex] == x) {
			return midIndex;
		}else if(arr[midIndex] < x) {
			return search(arr, midIndex + 1, end, x);
		}else {
			return search(arr, start, midIndex -1 , x);
		}
	}

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		int start = 0;
		int end = array.length - 1;
		int k=5;
		int ans = search(array, start, end, k);
		System.out.println(ans);

	}

}
