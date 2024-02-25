package nqtSheet;

public class FibonacciSeries {
	
	public static void series(int count) {
		int n1 = 0, n2 = 1, n3;		
		for(int i = 1; i <= count; i++) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		int r = 7;
		series(r);

	}

}
