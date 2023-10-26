package practice;

public class SumOfNumber {

	public static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String args[]) {
		int n = 175;
		int ans = sum(n);
		System.out.println(ans);
	}
}