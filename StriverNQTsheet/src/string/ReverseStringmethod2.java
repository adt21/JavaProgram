package string;

import java.util.Scanner;

public class ReverseStringmethod2 {
	
	public static void reverse(String str) {
		StringBuilder s = new StringBuilder();
		s.append(str);
		s.reverse();
		System.out.println(s);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = s.nextLine();
		reverse(str);
	}

}
