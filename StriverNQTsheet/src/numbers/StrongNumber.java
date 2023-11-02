package numbers;

import java.util.Scanner;

/*
 * Strong number is a special number whose sum of the factorial of digits is equal
 *  to the original number. For Example: 145 is strong number. Since, 1! + 4! + 5!
 */

public class StrongNumber {
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int ans = n * factorial(n-1);
		return ans;
	}
	
	public static boolean strong(int n) {
		int temp = n, fact = 0;
		while(temp > 0) {
			int rem = temp % 10;
			fact += factorial(rem);
			temp /= 10;
		}
		return n == fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		boolean b = strong(n);
		System.out.println(b);
	}

}
