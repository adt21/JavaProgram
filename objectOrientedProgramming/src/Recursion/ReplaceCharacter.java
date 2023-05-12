package Recursion;

public class ReplaceCharacter {
	public static String replaceCharacter(String s, char x, char y) {
		if(s.length() == 0) { // it is a empty String asa well as base case
			return s;
		}
		String smallOutput = replaceCharacter(s.substring(1), x, y);
		if(s.charAt(0) == x) {
			return y + smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
		
	}

	public static void main(String[] args) {
		System.out.println(replaceCharacter("abxcxdx", 'x', 'y'));

	}

}
