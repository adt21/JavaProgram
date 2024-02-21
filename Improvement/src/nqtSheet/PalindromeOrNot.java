package nqtSheet;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		int temp = n;
		int ans = 0;
		while(n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n = n/10;
		}
		if(temp == ans) {
			System.out.println("YES! It is a Palindrome Number");
		}else {
			System.out.println("No! It is not a Palindrome Number");
		}
	}

}
