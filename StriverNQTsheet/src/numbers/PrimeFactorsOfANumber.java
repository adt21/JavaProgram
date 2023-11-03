package numbers;

import java.util.Scanner;

/*
 * Prime Factor of a number is.
 *  Factors are the numbers that can be multiplied to get a new number.
 *   The factors of a number that are prime are called Prime Factors.
 *   12 = 2*2*3  or 60 = 2*2*3*5
 *   we will divide n by x as much as we can, and will keep changing N to N/x till n>1
 */

public class PrimeFactorsOfANumber {
	
	public static void primeFactor(int n) {
		for(int i = 2; n > 1; i++) {
			if(n % i == 0) {
				while(n % i == 0) {
					System.out.print(i + " ");
					n = n/i;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		primeFactor(n);
	}

}
