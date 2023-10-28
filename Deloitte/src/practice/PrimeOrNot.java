package practice;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static boolean isPrime(int n) {
		if(n == 1 || n == 0) {
			return false;
		}
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check1");
		int n = s.nextInt();
		boolean b = isPrime(n);
		System.out.println(b);

	}

}
