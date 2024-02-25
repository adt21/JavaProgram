package nqtSheet;

import java.util.Arrays;

public class LargestNoArray {
	
	public static int largest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr = {8, 4, 1,9,11};
		System.out.println(largest(arr));

	}

}
