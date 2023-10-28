package practice;

public class FactorialUsingRecursion {
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		int output = n * factorial(n-1);
		return output;
	}

	public static void printNfactorial(int n) {
		for(int i = 1; i <= n; i++) {
			System.out.print(factorial(i) + " ");
		}
	}
	public static void main(String[] args) {
		int n = 10;
		printNfactorial(n);

	}

}
