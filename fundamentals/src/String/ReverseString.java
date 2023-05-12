package String;
import java.util.Scanner;
public class ReverseString {
	public static String reverseString(String str) {
		String reversedString = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = "How are you";
		String reversedString = reverseString(str); // reversedString and reverseString is not same
		System.out.print(reversedString);
	}

}
