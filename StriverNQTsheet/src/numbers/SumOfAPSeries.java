package numbers;

public class SumOfAPSeries {
	
	public static double sumOfAP(double n, double a, double d) {
		double sum = 0.0;
		for(int i = 1; i <= n; i++) {
			sum += a;
			a += d; //each and every time a increased by d position
		}
//		double sum = (n/2) * (2*a + (n-1)*d); You can use this formula. This formula is for sum of ap series 
		return sum;
	}

	public static void main(String[] args) {
		double n = 4.0;
		double a = 2.0;
		double d = 2.0;
		double ans = sumOfAP(n, a, d);
		System.out.println(ans);
	}

}
