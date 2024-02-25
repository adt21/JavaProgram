package nqtSheet;

public class ReverseNumberOptimize {
	
	public static int reverse(int n) {
		String str = Integer.toString(n);
		String reversed = new StringBuilder(str).reverse().toString();
		int ans = Integer.parseInt(reversed);
		return ans;
		
	}

	public static void main(String[] args) {
		int n = 54321;
		System.out.println(reverse(n));

	}

}
