package Array;

import java.util.Scanner;

//WAP to find the total no of elements which are less than 5 or greater than 8

public class FindElement_TCS {
	
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the element at " + i + " th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int findNoOfElement(int[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 5 || arr[i] > 8) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = takingInput();
		printArray(arr);
		System.out.println("No of element = " + findNoOfElement(arr));
		
	}

}
