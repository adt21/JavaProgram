package fundamentals;

import java.util.Scanner;

public class SwapTwoNoUsing3rdVariable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value of a and b");
		int a = s.nextInt();//a = 4
		int b = s.nextInt();//b = 2
		System.out.println("Before swapping value of a: " + a + " and " + "b: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping value of a: " + a + " and " + "b: " + b);

	}

}
