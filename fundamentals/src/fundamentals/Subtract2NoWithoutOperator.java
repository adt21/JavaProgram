package fundamentals;

public class Subtract2NoWithoutOperator {
	
	public static int subtract(int a, int b) {
		for(int i = 1; i <= b; i++) {
			--a;
		}
		return a;
	}

	public static void main(String[] args) {
		int ans = subtract(44, 2);
		System.out.println(ans);

	}

}
