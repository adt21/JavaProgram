package swe;

public class FindUniqueCharacter {

	public static int uniqueChar(String str) {
		int index = 0;
		for(char c: str.toCharArray()) {
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				index = str.indexOf(c);
				return (index + 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		String str = "statistics";
		int ans = uniqueChar(str);
		System.out.println(ans);
	}

}
