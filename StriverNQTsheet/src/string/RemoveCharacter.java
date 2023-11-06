package string;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				System.out.print(str.charAt(i));
			}
			
		}

	}

}
