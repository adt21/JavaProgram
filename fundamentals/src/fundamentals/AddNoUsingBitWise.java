package fundamentals;

public class AddNoUsingBitWise {
	
	public static int addition(int a, int b) {
		while(b != 0) {
			int carry = a & b;
			a = a ^ b;
			b = carry << 1;
		}
		return a;
	}

	public static void main(String[] args) {
		int ans = addition(2, 4);
		System.out.println(ans);

	}

}
