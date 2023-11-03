package numbers;

import java.util.Scanner;

public class SumOfDigit {
	
	public static int sum(int n) {
		int ans = 0;
		while(n > 0) {
			int rem = n % 10;
			ans += rem;
			n /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		int ans = sum(n);
		System.out.println(ans);
	}

}
