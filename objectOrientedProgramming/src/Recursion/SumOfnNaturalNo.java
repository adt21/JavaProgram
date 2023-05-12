package Recursion;
//WAP of sum of n natural number using recursion
public class SumOfnNaturalNo {
	public static int sumn(int n) {
		if(n == 1) { // base case
			return 1;
		}
		int smallOutput = sumn(n-1); // hypothesis
		int output = n + smallOutput; //induction step
		return output;
	}

	public static void main(String[] args) {
		System.out.println(sumn(4));
	}

}
