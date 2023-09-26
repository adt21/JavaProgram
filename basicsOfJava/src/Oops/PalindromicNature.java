package Oops;

import java.util.Scanner;

public class PalindromicNature {
	
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Enter the element of the array at " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void printarray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static boolean isPalindrome(int n) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int temp = n;
		while(n > 0) {
			int rem = n % 10;
			sum = sum*10 + rem;
			n = n/10;
		}
		return temp == sum;
	}
	public static int palindromicNature(int arr[]) {
		int count = 0;
		if(arr.length == 0) {
			return -1;
		}
		for(int num: arr) {
			if(isPalindrome(num)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = takingInput();
		printarray(arr);
		int r = palindromicNature(arr);
		System.out.println(r);
	}

}
