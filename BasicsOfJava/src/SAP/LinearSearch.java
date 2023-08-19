package SAP;

//best case = O(1) and average & worst = O(n)

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = {1,3,5,6,7};
		int x = s.nextInt();
		int r = linearSearch(arr, x);
		System.out.println("the index of " + x + " is " + r);

	}

}
