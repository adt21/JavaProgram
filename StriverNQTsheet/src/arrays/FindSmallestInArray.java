package arrays;

import java.util.Arrays;

public class FindSmallestInArray {
	public static int findSmallest(int arr[]) {
		
		Arrays.sort(arr);
		return arr[0];
	}
	public static void main(String[] args) {
		int arr[] = {2,1,3,8};
		int r = findSmallest(arr);
		System.out.println("The smallest no in the Array is: " + r);
	}
}
