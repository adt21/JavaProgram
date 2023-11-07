package string;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveStringDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = s.nextLine();
		HashSet<Character> set = new HashSet<>();
		for(char c: str.toCharArray()) {
			set.add(c);
		}
		for(char ch: set) {
			System.out.print(ch);
		}
	}

}
