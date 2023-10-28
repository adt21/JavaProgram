package practice;

import java.util.Scanner;

public class Armstrong {
	
	public static void checkArmstrong(int n) {
		int temp = n, sum = 0;
		int count = 0;
		while(temp > 0) {
			++count;
			temp = temp/10;
		}
		
		temp = n;
		while(temp > 0) {
			int rem = temp % 10;
			sum = (int) (sum + Math.pow(rem, count));
			temp = temp/10;
		}
		
		if(n == sum) {
			System.out.println("The Given number is armstrong number");
		}else {
			System.out.println("The given number is not a armstrong number");
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		checkArmstrong(n);

	}

}
