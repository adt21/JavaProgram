package numbers;

import java.util.Scanner;

public class AbundantNumber {
	
	public static void isAbundant(int n) {
		int sum = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		if(sum > n) {
			System.out.println("Abundant Number");
		}else {
			System.out.println("Not Abundant Number");
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		isAbundant(n);
	}

}
