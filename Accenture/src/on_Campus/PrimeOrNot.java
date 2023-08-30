package on_Campus;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static boolean prime(int n) {
		if( n == 0 || n == 1) {
			return false;
		}
//		boolean isPrime = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
//		if(isPrime == true) {
//			System.out.println("The number is a prime number");
//		}else {
//			System.out.println("The number is not a prime number");
//		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean b = prime(n);
		System.out.println(b);
		//prime(n);
	}

}
