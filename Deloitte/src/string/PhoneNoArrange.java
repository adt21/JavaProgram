package string;

/*
 *Qs: Alex is a very good spy and he always wants to hide his contacts. To encrypt the original
phone number , he takes all the odd positioned numbers and places them in starting
positions and even position numbers to end position to encrypted phone numbers.
Help Alex to prepare transformed phone numbers by accepting N phone numbers.

	Sample Input 1:
	2
	2143658790 
	1234567890

	Output 1:

	2468913570
	1357924680
 */

public class PhoneNoArrange {
	
	public static String arrangeNo(String str) {
		
		String ans = "";
		for(int i = 0; i < str.length(); i+=2) {
			ans += str.charAt(i);
		}
		for(int i = 1; i < str.length(); i+=2) {
			ans += str.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String str = "2143658790";
		String s = arrangeNo(str);
		System.out.println(s);
	}

}
