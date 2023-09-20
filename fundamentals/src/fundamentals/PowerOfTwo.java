package fundamentals;

public class PowerOfTwo {
	public static boolean power(int n) {		
		while(n % 2==0) {
			n = n/2;
		}
		if(n == 1) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n = 42;
		boolean b = power(n);
		if(b) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
//Another efficient trick to solve this problem: Do AND operation between the given n and (n-1)
/*
 * public static boolean(int n){
 * 	if(n == 0){
 * 		return false;
 * 	}
 * 	return (n & (n-1) == 0)
 * }
 * 
 * if the AND between n and (n-1) == 0 then it will be the power of 2 
 * for example 4 = 0100  and (4-1) = 3 = 0011 now after doing AND operation the result is = 0000 = 0(power of 2)
 * */
