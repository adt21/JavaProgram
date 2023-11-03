package numbers;

import java.util.Scanner;

public class SumOfNoInRange {
	public static void sumInrange(int min, int max) {
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int n1 = s.nextInt();
		System.out.println("Enter maximum range");
		int n2 = s.nextInt();
		sumInrange(n1, n2);
	}

}
