package arrays;

import java.util.Arrays;

public class RearrangearrayIncreaseDecrease {

	public static void rearrange(int arr[], int n) {
		Arrays.sort(arr);
		//ascending order
		for(int i = 0; i < n/2; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//descending order
		for(int j = n - 1; j >= n/2; j--) {
			System.out.print(arr[j] + " ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {10, 6, 8, 9, 1, 2, 3, 4, 5, 7};
		int n = arr.length;
		rearrange(arr, n);

	}

}
