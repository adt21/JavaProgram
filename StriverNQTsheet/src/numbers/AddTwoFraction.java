package numbers;

public class AddTwoFraction {
	
	public static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		return gcd(b%a, a);
	}
	
	public static void simple(int num3, int den3) {
		int gcd_ = gcd(num3,den3);
		num3 /= gcd_;
		den3 /= gcd_;
	}

	public static void main(String[] args) {
		int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
		
		den3 = (den1*den2)/gcd(den1,den2);
		num3 = num1*(den3/den1) + num2*(den3/den2);
		simple(num3, den3);
		System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + num3 + "/" + den3);

	}

}
