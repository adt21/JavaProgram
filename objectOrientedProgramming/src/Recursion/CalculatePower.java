package Recursion;

public class CalculatePower {
	public static int power(int n, int p) {
		if(p == 0) {
			return 1;
		}
		int output = n * power(n, p-1);
		return output;
	}

	public static void main(String[] args) {
		System.out.println(power(2,3));
		
	}

}
