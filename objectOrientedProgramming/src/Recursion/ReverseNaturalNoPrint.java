package Recursion;

public class ReverseNaturalNoPrint {
	public static void printNaturalNo(int n) {
		if(n == 0) {
			return; // if no = 0 then it do nothing
		}
		System.out.println(n);
		printNaturalNo(n - 1);
	}

	public static void main(String[] args) {
		printNaturalNo(5);
	}

}
