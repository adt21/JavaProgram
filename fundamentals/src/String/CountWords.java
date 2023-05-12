package String;
import java.util.Scanner;
public class CountWords {
	public static int CountWords(String str) {
		if(str.length() == 0) { // this is for empty string
			return 0;
		}
		int spaces = 1;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == ' ') {
				spaces++;
			}
		}
		return spaces;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int spaces = CountWords(str);
		System.out.println(spaces);
	}

}
