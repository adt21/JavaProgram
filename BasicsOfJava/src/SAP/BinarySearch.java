package SAP;

//Best case time complexity = O(1)  and average & worst = O(log n)

import java.util.Scanner;

public class BinarySearch {
	
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element at " + i + "th index of the array");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printarray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int binarySearch(int arr[],int start, int end, int x) {
		if(start > end) {
			return -1;
		}
		int midIndex = start + (end - start)/2;
		if(arr[midIndex] == x) {
			return midIndex;
		}
		else if(arr[midIndex] < x) {
			return binarySearch(arr, midIndex + 1, end, x);
		}
		else {
			return binarySearch(arr, start, midIndex - 1, x);
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = takingInput();
		printarray(arr);
		System.out.println("Enter the element which you want to search in the array");
		int x = s.nextInt();
		int r = binarySearch(arr, 0, arr.length-1, x);
		System.out.println("The index of " + x +  " is: " + r);
	}

}
