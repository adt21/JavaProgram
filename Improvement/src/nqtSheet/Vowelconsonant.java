package nqtSheet;

import java.util.Scanner;

public class Vowelconsonant {
	
	public static void count(String str) {
		str = str.toLowerCase();
		int vowel = 0, consonant = 0, whitespace = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel++;
			}else if(ch >= 'a' && ch <= 'z') {
				consonant++;
			}else if(ch == ' ') {
				whitespace++;
			}
		}
		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonant);
		System.out.println("WhiteSpaces: " + whitespace);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		count(str);

	}

}
