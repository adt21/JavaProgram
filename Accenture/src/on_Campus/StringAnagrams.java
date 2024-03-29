package on_Campus;

/*
 * input: string s1 = "silent" and String s2 = "listen". output: True
 * if you arrange both string you can see both are same
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams {
	
	public static boolean anagram(String s, String t) {
		char[] sArr = s.toCharArray();
		char[] tArr = t.toCharArray();
		Arrays.sort(sArr);
		Arrays.sort(tArr);
		return Arrays.equals(sArr, tArr);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String s = sc.nextLine();
		System.out.println("Enter second string");
		String t = sc.nextLine();
		boolean b = anagram(s,t);
		System.out.println(b);

	}

}
