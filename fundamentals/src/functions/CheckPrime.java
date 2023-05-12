package functions;
import java.util.Scanner;
public class CheckPrime {
	public static boolean primeNumberCheck(int n) {
		int div = 2;
		while(div <= n/2) {
			if(n % div == 0) {
				//not prime
				return false;
			}
		 div = div + 1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = primeNumberCheck(n);
		System.out.println(isPrime);
	}

}
