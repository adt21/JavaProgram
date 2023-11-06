package string;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.nextLine();
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println("reverse of this String = " + reverse);
	}

}
