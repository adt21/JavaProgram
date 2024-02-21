package nqtSheet;

import java.util.Scanner;

public class PrimeOrNot {
	
	public static boolean checkPrime(int n) {
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

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter a Number");
	    int n = s.nextInt();
	    boolean b = checkPrime(n);
	    System.out.println(b);

	}

}
