package string;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			boolean b = Character.isWhitespace(str.charAt(i));
			if(b) {
				continue;
			}
			System.out.print(str.charAt(i));
		}

	}

}
