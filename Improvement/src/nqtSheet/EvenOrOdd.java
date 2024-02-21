package nqtSheet;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		if(n % 2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}

	}

}
