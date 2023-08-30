package on_Campus;

public class Reversestring {
	public static String reverse(String str) {
		String reversedString = "";
		for(int i = str.length()-1; i >= 0; i-- ) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}
	public static void main(String[] args) {
		String s = reverse("aditi");
		System.out.println(s);
	}
	
}
