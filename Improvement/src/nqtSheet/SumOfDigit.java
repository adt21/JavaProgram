package nqtSheet;

import java.util.Scanner;

public class SumOfDigit {
	
	public static int sum(int x) {
		int ans = 0;
		while(x > 0) {
			int rem = x % 10;
			ans += rem;
			x /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = sum(n);
		System.out.println(ans);
	}

}
