package nqtSheet;

public class RemoveExtraChar {
	
	public static String removeChar(String str) {
		StringBuffer ans = new StringBuffer();
		
		for(int i = 0; i < str.length(); i++) {
			int ascii = (int)str.charAt(i);
			
			if((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) {
				//System.out.print(str.charAt(i) + "");
				ans.append(str.charAt(i));
			}
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str = "take12% *&u ^$#forward";
		String s = removeChar(str);
		System.out.println(s);

	}

}
