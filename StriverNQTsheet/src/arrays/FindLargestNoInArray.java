package arrays;

import java.util.Arrays;

public class FindLargestNoInArray {
	
	public static int findLargest(int arr[]) {
		
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		
		int arr[] = {9, 11, 13, 90, 5, 10};
		int r = findLargest(arr);
		System.out.println("The largest element in the array is: " + r);
	}

}
