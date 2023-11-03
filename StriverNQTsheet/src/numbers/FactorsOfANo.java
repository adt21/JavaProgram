package numbers;

import java.util.Scanner;
//factors means divisors of a number Example: 6 = 1, 2, 3, 6 ( as these are divisors of 6)
public class FactorsOfANo {
	
	public static void divisorsOfNumber(int n) {
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		divisorsOfNumber(n);
	}

}
