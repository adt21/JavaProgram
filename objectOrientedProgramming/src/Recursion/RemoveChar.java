package Recursion;

public class RemoveChar {
	public static String replaceCharacter(String s, char x) {
		if(s.length()== 0) {
			return s;
		}
		String smallOutput = replaceCharacter(s.substring(1),x);
		if(s.charAt(0) == x) {
			return smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
	}

	public static void main(String[] args) {
		System.out.println(replaceCharacter("abcxxyxzxwxsdx", 'x'));
	}

}
