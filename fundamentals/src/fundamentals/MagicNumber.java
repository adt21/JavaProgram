package fundamentals;

public class MagicNumber {
	/* Magic numbers are those number whose sum of each no = 1
	 * that means suppose given no is 37  = 3 + 7 = 10 = 1 + 0 = 1(so 37 is a magic number)
	 * example 2: 45 = 4 + 5 = 9 (this 45 is not a magic number)
	 */
	
	public static boolean isMagic(int n) {
		int sum = 0;
		while(n > 0 || sum > 9) { // loop will continue till n > 0 or sum > 9. if any of these condition become true then loop will continue
			if(n == 0) {
				n = sum;
				sum = 0;
			}
		sum += n % 10;
		n/=10;
	}
		return (sum == 1); // if sum = 1 then it will return true
  }
	public static void main(String[] args) {
		int n = 10;
		if(isMagic(n)) {
			System.out.println(n + " is a magic number");
		}else {
			System.out.println(n + " is not a magic number");
		}
	}
}