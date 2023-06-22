package sem6th;

// Swap two number without using third variable

import java.util.Scanner;

public class SwapTwoNumber {
	
	public static void swapNumber() {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter first number");
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b = s.nextInt();
		//swapping number
		a = a + b;  // suppose a = 4 b = 2 so a+b = 6
		b = a - b; // here b = 6 - 2 = 4
		a = a - b; // here a = 6 - 4 = 2
		System.out.println(" After swapping value of a is " + a + " & value of b is " + b);
	}
	public static void main(String[] args) {
		swapNumber();
	}
}
