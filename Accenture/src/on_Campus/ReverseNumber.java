package on_Campus;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverse(int n) {
		int temp = n, sum = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = reverse(n);
		System.out.println(b);
	}

}
