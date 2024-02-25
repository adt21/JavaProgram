package nqtSheet;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int ans = n * factorial(n-1);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		System.out.println(factorial(n));

	}

}
