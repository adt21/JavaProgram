package numbers;

public class SumOfGPSeries {
	
	public static double sumOfGP(double a, double r, double n) {
		double sum = 0.0;
		for(int i = 1; i <= n; i++) {
			sum += a;
			a = a*r;
		}
//		double sum = a * (Math.pow(r, n) - 1)/(r-1); //This is the formula of Sum of GP series
		return sum;
	}

	public static void main(String[] args) {
		double a = 10;
		double r = 3;
		double n = 4;
		double d = sumOfGP(a, r, n);
		System.out.println(d);

	}

}
