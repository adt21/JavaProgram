package numbers;

import java.util.Scanner;

/*
 *  A number is called an Automorphic number if and only if its square ends
 *   in the same digits as the number itself.
 *   Example: n = 76 and 76 * 76 gives 5776, it ends with the given number
 */
public class AutomorphicNumber {
	
	public static boolean isAutomorphic(int n) {
		int square = n * n;
		
		while(n > 0) {
			if(n % 10 != square % 10) {
				return false;
			}
			n /= 10;
			square /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		boolean b = isAutomorphic(n);
		System.out.println(b);

	}

}
