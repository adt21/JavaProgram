package nqtSheet;

public class RemoveBrackets {
	
	public static String remove(String str) {
		StringBuilder ans = new StringBuilder();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == ')') {
				continue;
			}
			ans.append(ch);
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str = "a+((b-c)+d)";
		System.out.println(remove(str));

	}

}
