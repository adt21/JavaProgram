package nqtSheet;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestLargest {
	
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array length");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter no at " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void second(int arr[]) {
		Arrays.sort(arr);
		int secondMax = arr[arr.length - 2];
		int secondMin = arr[1];
		System.out.println("Second largest is " + secondMax);
		System.out.println("Second smallest is " + secondMin);
	}

	public static void main(String[] args) {
		int arr[] = takingInput();
		print(arr);
		second(arr);

	}

}
