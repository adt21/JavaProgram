package nqtSheet;

import java.util.Scanner;

public class RemoveSpaces {
	public static void spaces(String str) {
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == ' ') {
				continue;
			}
			System.out.print(str.charAt(i) + "");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		spaces(str);
	}

}
