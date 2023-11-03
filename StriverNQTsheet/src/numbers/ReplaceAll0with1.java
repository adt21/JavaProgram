package numbers;

import java.util.Scanner;

public class ReplaceAll0with1 {
	
	public static int replace(int n) {
		if(n == 0) {
			return 1;
		}
		int ans = 0, temp = 1;
		while(n > 0) {
			int rem = n % 10;
			if(rem == 0) {
				rem = 1;
			}
			ans = (rem * temp) + ans;
			n /= 10;
			temp *= 10;
		}
		return ans;
	}
	

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		int ans = replace(n);
		System.out.println(ans);
	}

}
