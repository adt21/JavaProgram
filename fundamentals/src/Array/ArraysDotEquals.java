package Array;

import java.util.Arrays;

public class ArraysDotEquals {
	public static boolean equal(int arr1[], int arr2[]) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		int[] arr1 = {2,1,7,4,9};
		int[] arr2 = {7,0,2,9,4};
		boolean b = equal(arr1, arr2);
		System.out.println(b);
		

	}

}
