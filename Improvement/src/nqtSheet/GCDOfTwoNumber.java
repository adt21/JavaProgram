package nqtSheet;

public class GCDOfTwoNumber {
	
	public static int gcd(int x, int y) {
		if(x == 0) {
			return y;
		}
		return gcd(y % x, x);
	}

	public static void main(String[] args) {
		int x = 2, y = 4;
		int ans = gcd(x, y);
		System.out.println(ans);
	}

}
