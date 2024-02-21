package nqtSheet;

import java.util.Scanner;

public class PerfectNumber {
	
	public static boolean isPerfect(int n) {
		int temp = n, sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		boolean b = isPerfect(n);
		System.out.println(b);

	}

}
