package numbers;

import java.util.Scanner;

public class PrimeNumberInRange {
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void primeNo(int min, int max) {
		
		for(int i = min; i <= max; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int min = s.nextInt();
		System.out.println("Enter maximum range");
		int max = s.nextInt();
		primeNo(min, max);
	}

}
