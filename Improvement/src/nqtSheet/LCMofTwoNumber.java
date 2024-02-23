package nqtSheet;

public class LCMofTwoNumber {
	
	public static int gcd(int x, int y) {
		if(x == 0) {
			return y;
		}
		return gcd(y % x, x);
	}
	
	public static int lcm(int a, int b) {
		int ans = (a*b)/gcd(a, b);
		return ans;
	}

	public static void main(String[] args) {
		int a = 2, b = 4;
		System.out.println(lcm(a, b));
	}

}
