package on_Campus;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("Given string is a Palindrome");
		}else {
			System.out.println("Given string is not a Palindrome");
		}
	}

}
