package nqtSheet;

import java.util.Scanner;

public class PalindromeString {
	
	public static boolean isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
			
		}
		return str.equals(reverse);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		boolean b = isPalindrome(str);
		System.out.println(b);

	}

}
