package classesandobjects;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	public void setNumerator(int num) {
		this.numerator = num;
		simplify();
	}
	public int getNumerator() {
		return this.numerator;
	}
	public void setDenominator(int num) {
		if(num == 0) {
			denominator = 1; // for now we set it's value as 1 but we know if denominator = 0 then fraction = undefined
		}
		this.denominator = num;
		simplify();
	}
	public int getDenominator() {
		return this.denominator;
	}
	
	private void simplify() {
		int gcd = 1; // gcd = greatest common factor/divisor
		int smaller = Math.min(numerator, denominator); // math.min means smaller number between numerator and denominator like between(8 & 10) small number is 8
		for(int i = 2; i <= smaller; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator = denominator/gcd;
	}
	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}

}
