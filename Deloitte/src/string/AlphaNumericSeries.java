package string;

/*
 * QS is: In input Alpha numeric string is given.
	Our task is to form the string of indexes where in numbers appear in input string.
	Test Case 1:
	Input : ABC65D19HY09
	Output : 34671011
 */

public class AlphaNumericSeries {
	
	public static void alphanum(String str) {
		
		String ans = "";
		for(int i = 0; i < str.length(); i++) {
			boolean b = Character.isDigit(str.charAt(i));
			if(b) {
				System.out.print(ans + i);
			}
		}
	}

	public static void main(String[] args) {
		
		String str = "012ABDH52";
		alphanum(str);

	}

}
