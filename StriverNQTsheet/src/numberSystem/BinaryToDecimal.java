package numberSystem;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int binary(int n) {
		int ans = 0;
		for(int i = 1; n > 0; i*=2) {
			int lastDigit = n % 10;
			ans += lastDigit*i;
			n /= 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int ans = binary(n);
		System.out.println(ans);

	}

}
