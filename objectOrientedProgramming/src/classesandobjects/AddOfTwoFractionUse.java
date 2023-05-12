package classesandobjects;

public class AddOfTwoFractionUse {

	public static void main(String[] args) {
		AddOfTwoFraction f1 = new AddOfTwoFraction(4, 6);
		AddOfTwoFraction f2 = new AddOfTwoFraction(4, 8);
		f1.add(f2);
		f1.print();
	}

}
