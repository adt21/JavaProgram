package Recursion;

public class FibonacciNumber {
	public static int fibonacci(int n) {
		if(n == 0 || n == 1) { //fibonacci series start from 0,1,1,2,3,5....so we consider here
			//base case 0 as well as 1. here two base case is required as sum of previous two no = 3rd no
			return n;
		}
		int result = fibonacci(n-1) + fibonacci(n-2);
		return result;
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(3)); // (n=0th)0,(n = 1st)1,(n=2nd)1,(n=3rd)2

	}

}
