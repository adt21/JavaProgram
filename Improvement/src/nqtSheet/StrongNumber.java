package nqtSheet;

import java.util.Scanner;

public class StrongNumber {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int ans = n * factorial(n-1);
		return ans;
	}
	
	public static boolean strong(int n){
		int fact = 0, temp = n;
		while(n > 0) {
			int rem = n % 10;
			fact += factorial(rem);
			n /= 10;
		}
		return temp == fact;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		boolean b = strong(n);
		System.out.println(b);

	}

}
