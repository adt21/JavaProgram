package arrays;

import java.util.Scanner;

public class SumOfNnaturalNo {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no for sum of N natural no");
		int n = s.nextInt();
		int ans = n * (n+1)/2;
		System.out.println(ans);

	}

}
