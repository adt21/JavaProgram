package fundamentals;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isNumber(int n) {
		if(n == 1 || n == 0) {
			return false;
		}
		int sum = 1;
		for(int i = 2; i < n; i++) {
			if(n%i == 0) {
				sum += i;
			}
		}
		if(sum == n) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(isNumber(n));
	}

}
