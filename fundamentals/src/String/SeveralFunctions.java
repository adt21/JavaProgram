package String;

public class SeveralFunctions {

	public static void main(String[] args) {
		String str1 = "Aditi";
		String str2 = " Paul";
		String str3 = "Coding";
		String str4 = " is fun";
		str1 += str2;
		System.out.println(str1);
		System.out.println(str3.concat(str4)); // to add two string
		System.out.println(str1.equals(str3)); // check both equals or not
		System.out.println(str1.compareTo(str3)); // compare two string and return the subtract of two ascii value of 1st two letter of both string
		System.out.println(str1.contains("iti"));// check whether string contains those particular characters or not
	}

}
