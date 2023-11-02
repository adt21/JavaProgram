package numbers;

import java.util.Scanner;

public class ArmstrongOrNot {
	
	public static boolean isArmstrong(int n) {
		int temp = n, ans = 0;
		int count = 0;
		while(temp > 0) {
			++count;
			temp = temp/10;
		}
		temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			ans = (int) (ans + Math.pow(rem, count));
			temp = temp/10;
		}
		return n == ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		boolean b = isArmstrong(n);
		System.out.println(b);
	}

}
