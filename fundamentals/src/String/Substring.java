package String;

public class Substring {
// string index start from 0
	public static void main(String[] args) {
		String str1 = "Coding";
		System.out.println(str1.substring(3));// starting from index 2 that means ding(0-C,1-o,2-d)
		String str2 = "ninjas";
		String substr = str2.substring(2, 5); // here end index(5) is exclusive so we need to write here length of the string to print remaining all character from starting index.
		System.out.println(substr);
		String s = "Aditi";
		System.out.println(s.substring(0, 5));
	}
}
