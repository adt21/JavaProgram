package fundamentals;

/*
 * This is a optimal solution as Optimized Java Code for Prime Number
   Instead of checking till n, we can check till root of n because a larger factor of n
   must be a multiple of a smaller factor that has been already checked. 
 */
public class PrimeNumber {
	
	public static boolean prime(int n) {
		if(n == 0 || n == 1) {
			return false;
		}
		for(int i = 2; i < Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		boolean b = prime(14);
		System.out.println(b);
	      		
	}

}
