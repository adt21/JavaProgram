package nqtSheet;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		String strs = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse string is " + strs);
		

	}

}
