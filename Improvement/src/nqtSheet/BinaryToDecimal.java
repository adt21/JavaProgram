package nqtSheet;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int decimal(int n) {
		int ans = 0;
		for(int i = 1; n > 0; i *= 2) {
			int rem = n % 10;
			ans += (rem*i);
			n = n/10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		System.out.println(decimal(n));

	}

}
