package arrays;

import java.util.Scanner;

public class SumOfTheArray {
	
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("enter the element at " + i + "th index");
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
	
	public static int sumOfArray(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = takingInput();
		print(arr);
		int n = sumOfArray(arr);
		System.out.println("Sum = " + n);
	}

}
