package String;

public class ReverseNumberStringOperation {
	
	public static int reverse(int num) {
		String str = Integer.toString(num);
		String reverseStr = new StringBuilder(str).reverse().toString();
		int reversedNum = Integer.parseInt(reverseStr);
		return reversedNum;
	}

	public static void main(String[] args) {
		
		int n = 123;
		int ans = reverse(n);
		System.out.println(ans);
	}

}
