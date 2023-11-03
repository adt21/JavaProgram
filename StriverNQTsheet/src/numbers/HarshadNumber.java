package numbers;

import java.util.Scanner;

/*
 *  n = 378 and 3+7+8=18. 378 is divisible by 18. Therefore 378 is a Harshad number
 */
public class HarshadNumber {
	
	public static boolean isHarshad(int n) {
		
		int sum = 0, temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			sum += rem;
			temp = temp/10;
		}
		return (n % sum == 0);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = s.nextInt();
		boolean b = isHarshad(n);
		System.out.println(b);
	}

}
