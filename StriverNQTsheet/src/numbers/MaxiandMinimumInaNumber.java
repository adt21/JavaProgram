package numbers;

import java.util.Scanner;

public class MaxiandMinimumInaNumber {
	
	public static void maxiAndMini(int n) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while(n > 0) {
			int rem = n % 10;
			max = Math.max(max, rem);
			min = Math.min(min, rem);
			n = n/10;
		}
		System.out.println("Maximum digit is: " + max);
		System.out.println("Minimum digit is: " + min);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		maxiAndMini(n);
	}

}
