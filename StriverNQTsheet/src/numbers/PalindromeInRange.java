package numbers;

import java.util.Scanner;

public class PalindromeInRange {
	
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
	
	public static void palindrome(int min, int max) {
		boolean foundPalindrome = false;
		for(int i = min; i <= max; i++) {
			if(isPalidrome(i)) {
				System.out.print(i + " ");
				foundPalindrome = true;
			}
		}
		if(! foundPalindrome) {
			System.out.println("Not found");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int min = s.nextInt();
		System.out.println("Enter maximum range");
		int max = s.nextInt();
		palindrome(min, max);
	}

}

/*
 * or follow this::
 * 
 * 		   public static void palindrome(int min, int max) {
 * 		   for(int i = min; i <= max; i++) {
 *         int temp = i;
			int reverse = 0; //every time it will start fresh for each number with value 0
			while(temp > 0) {				
				int rem = temp % 10;
				reverse = reverse*10 + rem;
				temp = temp / 10;
			}
			if(i == reverse) {
				System.out.print(i + " ");
				foundPalindrome = true;
			}
			
		}
		if(! foundPalindrome) {
			System.out.println("Not found");
		}
	}
 */
