package nqtSheet;

import java.util.Scanner;

public class FindAscii {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a character");
		char c = s.next().charAt(0);
		int n = c;
		System.out.println("Ascii value is: " + n); 
		

	}

}
