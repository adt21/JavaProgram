package numbers;

import java.util.Scanner;

/*
 * Find permutations in which n people can occupy r seats in a classroom.
 * To permute n people in r seats we have to find the value of n!/(n-r)!
 */
public class Permutation {
	
	public static int fact(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	public static void permutation(int n, int r) {
		int ans = fact(n) / fact(n-r);
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the n number of student");
		int n = s.nextInt();
		System.out.println("Enter the r seat number");
		int r = s.nextInt();
		permutation(n, r);

	}

}
