package nqtSheet;

import java.util.Scanner;

public class MaxAndMinDigit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(n > 0) {
			int rem = n % 10;
			min = Math.min(min, rem);
			max = Math.max(max, rem);
		    n/=10;
		}
		
		System.out.println("Minimum digit " + min);
		System.out.println("Maximum digit " + max);
	}

}
