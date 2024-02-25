package nqtSheet;

public class BinarySearch {
	
	public static int binary(int arr[], int start, int end, int elem) {
		if(start > end) {
			return -1;
		}
		int midIndex = start + (end - start)/2;
		if(elem < arr[midIndex]) {
			return binary(arr, start, midIndex-1, elem);
		}
		else if(elem > arr[midIndex]) {
			return binary(arr, midIndex+1, end, elem);
		}else {
			return midIndex;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int startIndex = 0;
		int endIndex = arr.length-1;
		int element = 9;
		int ans = binary(arr, startIndex, endIndex, element);
		System.out.println(ans);
	}

}
