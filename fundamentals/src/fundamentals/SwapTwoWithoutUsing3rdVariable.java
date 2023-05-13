package fundamentals;
import java.util.Scanner;
public class SwapTwoWithoutUsing3rdVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a = s.nextInt();//a = 4
		int b = s.nextInt();//b = 2
		System.out.println("Before swapping value of a: " + a + " and " + "b: " + b);
		a = a + b;//a = 4 + 2 = 6
		b = a - b;// b = 4 - 2 = 2
		a = a - b;//a = 6 - 2 = 4
		System.out.println("After swapping value of a: " + a +" and " + "b: " + b);
	}

}
