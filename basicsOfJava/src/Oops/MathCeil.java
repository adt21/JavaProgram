package Oops;

public class MathCeil {

	/*
	 * Math.ceil() method always used in double(decimal) data whereas it prints
	 * the closest greater value than it like 3.14/3.8 = 4.0
	 * for negative decimal number it also prints the closest greater value than it like -7.1 = -7.0
	 */
	public static void main(String[] args) {
		double x = 3.18;
		double p = -7.0;
		double q = -7.8;
		double r = 3.14;
		double s = 3.9;
		int y = (int) Math.ceil(x);
		double z = Math.ceil(x);
		double a = Math.ceil(p);
		double b = Math.ceil(q);
		double c = Math.ceil(r);
		double d = Math.ceil(s);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
