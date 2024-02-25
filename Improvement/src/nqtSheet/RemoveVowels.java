package nqtSheet;

import java.util.Scanner;

public class RemoveVowels {
	
	public static void vowels(String str) {
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				continue;
			}
			System.out.print(str.charAt(i) + "");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		vowels(str);

	}

}
