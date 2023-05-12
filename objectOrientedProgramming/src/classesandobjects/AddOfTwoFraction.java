package classesandobjects;

public class AddOfTwoFraction {
	private int numerator;
	private int denominator;
	public AddOfTwoFraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();
	}
	private void simplify() {
		int gcd = 1; // gcd = greatest common factor
		int smaller = Math.min(numerator, denominator);
		for(int i = 2; i <= smaller; i++) {
			if(numerator % i == 0 && denominator % i == 0) {
				gcd = i;
			}
		}
		numerator = numerator / gcd;
		denominator = denominator / gcd;
		
	}
	public void add(AddOfTwoFraction f2) {
		//first fraction is the fraction on which function is called
		//second fraction is passed as arguments
		//simply means we will do here f1 = f1 + f2 [4/6 = (4/6 + 4/8)] that's why here 4/6(inside bracket) is current fraction so we use here this.nu and this.de
		
		this.numerator = this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator = this.denominator * f2.denominator;
		simplify();
	}
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	

}
