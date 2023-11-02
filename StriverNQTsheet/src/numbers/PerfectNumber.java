package numbers;

import java.util.Scanner;

/*
 * Perfect Number is an integer which is equal to the sum of it's proper divisors
 * Proper divisor is except itself other divisor. For example divisors of 6 = 1,2,3,6
 * so here proper divisors are 1,2,3 
 * as 1+2+3 = 6 so 6 is a perfect number also another example 28, etc.
 */

public class PerfectNumber {
	
	public static boolean isPerfect(int n) {
		int ans = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				ans += i;
			}
		}
		return n == ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		boolean b = isPerfect(n);
		System.out.println(b);
	}

}
