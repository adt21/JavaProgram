package numbers;

import java.util.Scanner;

//check whether a number is the sum of two prime or not

public class SumOfTwoPrime {
	
	public static boolean isPrime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	 public static boolean isSumPrime(int n) {
		 if(isPrime(n) && isPrime(n - 2)) { // example: 73 && (73-2) = 71 both prime so you can write (71 + 2) = 73.
			 return true;
		 }else {
			 return false;
		 }
	 }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		boolean b = isSumPrime(n);
		System.out.println(b);

	}

}
