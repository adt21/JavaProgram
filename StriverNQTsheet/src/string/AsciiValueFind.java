package string;

import java.util.Scanner;

public class AsciiValueFind {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char c = s.next().charAt(0);
		
		int n = c;
		System.out.println("Ascii value of the given Character: " + n);
	}

}
