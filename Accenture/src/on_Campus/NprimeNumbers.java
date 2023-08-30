package on_Campus;

import java.util.Scanner;

public class NprimeNumbers {
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
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
		System.out.println("Enter the number upto which you want to print prime numbers");
		int num = s.nextInt();
		for(int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

}
