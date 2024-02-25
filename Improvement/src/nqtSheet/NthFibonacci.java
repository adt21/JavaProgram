package nqtSheet;

public class NthFibonacci {
	
	public static int fibonacci(int r) {
		if(r == 0 || r == 1) {
			return r;
		}
		return fibonacci(r-1) + fibonacci(r-2);
	}

	public static void main(String[] args) {
		int r = 6;
		System.out.println(fibonacci(r));

	}

}
