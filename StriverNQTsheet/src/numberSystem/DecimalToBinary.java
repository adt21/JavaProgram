package numberSystem;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void decimal(int n) {
		int arr[] = new int[1000];
		int i = 0;
		while(n > 0) {
			int rem = n % 2;
			arr[i] = rem;
			n = n/2;
			i++;
		}
		for(int j = i - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		decimal(n);

	}

}
