package numbers;

import java.util.Scanner;

public class PalindromeOrNot {
	
	public static boolean isPalidrome(int n) {
		int reverse = 0;
		int temp = n;
		
		while(n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n/10;
		}
		return temp == reverse;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = s.nextInt();
		boolean b = isPalidrome(n);
		System.out.println(b);
	}

}
