package on_Campus;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static boolean prime(int n) {
		if( n == 0 || n == 1) {
			return false;
		}
//		boolean isPrime = true;
		for(int i = 2; i < n; i++) { //otherwise you can write i <= Math.sqrt(n) Optimized Java Code for Prime Number
			//Instead of checking till n, we can check till root of n because a larger factor of n must be a multiple of a smaller factor that has been already checked. 
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
