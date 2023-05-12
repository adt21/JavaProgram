package Recursion;

public class RemoveConsecutiveDuplicates {
	public static String removeDuplicates(String s) {
		if(s.length() <= 1) {
			return s;
		}
		String smallOutput = removeDuplicates(s.substring(1));
		if(s.charAt(0) == s.charAt(1)) {
			return smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		System.out.println(removeDuplicates("aabbcc"));
	}

}
