package nqtSheet;

import java.util.Scanner;

public class PalindromeInRange {
	
	public static int palindrome(int n) {			
		int ans = 0;
		while(n > 0) {
			int rem = n % 10;
			ans = ans * 10 + rem;
			n = n/10;
		}
		return ans;
	}

	public static void main(String[] args) {		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the minimum range");
		int min = s.nextInt();
		System.out.println("Enter the maximum range");
		int max = s.nextInt();
		
		for(int i = min; i <= max;  i++) {
			int r = palindrome(i);
			if(i == r) {
				System.out.print(i + " ");
			}
			
		}
	}

}
