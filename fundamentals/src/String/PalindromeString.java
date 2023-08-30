package String;
import java.util.Scanner;
public class PalindromeString {
	public static void isPalindrome(String str) {
		String reverse = "";
		for(int i = str.length()-1;i>=0;i--) {
			reverse += str.charAt(i);
		}
		if(reverse.equals(str)) {
			System.out.println(reverse + " " + "is a palindrome number");
		}
		else {
			System.out.println(reverse + " " + "is not a palindrome number");
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		isPalindrome(str);

	}

}
