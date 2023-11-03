package numbers;

import java.util.Scanner;

public class GreatestOfThreeNumber {
	
	public static int greatest(int n1, int n2, int n3) {
		return Math.max(n1, Math.max(n2, n3));
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		int ans = greatest(n1, n2, n3);
		System.out.println("Greatest no is: " + ans);

	}

}
