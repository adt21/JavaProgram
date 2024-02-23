package nqtSheet;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void binary(int n) {
		int arr[] = new int[1000];
		int i = 0;
		while(n > 0) {
			int rem = n % 2;
			arr[i] = rem;
			n /= 2;
			i++;
		}
		for(int j = i; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		int n = s.nextInt();
		binary(n);
	}

}
