package numbers;

import java.util.Scanner;

public class LcmOfTwoNo {
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}
	public static int lcm(int a, int b) {
		return (a*b)/gcd(a, b);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int n1 = s.nextInt();
		System.out.println("Enter 2nd number");
		int n2 = s.nextInt();
		int ans = lcm(n1, n2);
		System.out.println(ans);

	}

}
