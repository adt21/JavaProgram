package fundamentals;

import java.util.Scanner;

public class GcdOfTwoNumbers {
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = gcd(a,b);
		System.out.println(c);
	}

}
