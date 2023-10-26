package string;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str = "aba";
		String reverse = "";
		for(int i = str.length() - 1; i >= 0 ; i--) {
			reverse += str.charAt(i);
		}
		if(reverse.equals(str)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}
