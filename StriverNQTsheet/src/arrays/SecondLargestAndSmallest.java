package arrays;

import java.util.Arrays;

public class SecondLargestAndSmallest {
	
	public static int secondLargest(int arr[]) {
		Arrays.sort(arr);
		return arr[1];
	}
	
	public static int secondSmallest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length - 2];
	}
	public static void main(String[] args) {
		
		int arr[] = {5,6,1,2,8,9,7};
		int r1 = secondLargest(arr);
		int r2 = secondSmallest(arr);
		System.out.println("Second Largest Element is: " + r1);
		System.out.println("Second Smallest Element is: " + r2);

	}

}
