package nqtSheet;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestNo {
	
	public static int[] takinginput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the element at " + i + "th position");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static int smallest(int arr[]) {
		Arrays.sort(arr);
		return arr[0];
	}

	public static void main(String[] args) {
		int arr[] = takinginput();
		int ans = smallest(arr);
		System.out.println("The smallest element is " + ans);
	}

}
