package numbers;

import java.util.Scanner;

public class PowerOfaNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		System.out.println("Enter the power");
		int k = s.nextInt();
//		int power = (int) Math.pow(n, k);
//		System.out.println(power);
		int ans = 1;
		for(int i = 1; i <= k; i++) {
			 ans = ans*n;
		}
		System.out.println(ans);

	}

}

