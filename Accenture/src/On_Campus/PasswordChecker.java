package On_Campus;

public class PasswordChecker {
	public static int passWord(String str, int n) {
		boolean isLen = false, isNum = false, isCap = false, isSpace = true, isFirst = true;
		if(str.length() >= 4) {
			isLen = true;
		}
		if(Character.isDigit(str.charAt(0))) {
			isFirst = false;
		}
		char[] ch = str.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				isNum = true;
			}
			if(ch[i] >= 65 && ch[i] <= 97) {
				isCap = true;
			}
			if(ch[i] == '/' && ch[i] == ' ') {
				isSpace = false;
			}
		}
		if(isLen && isNum && isCap && isSpace && isFirst) {
			return 1;
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		System.out.println(passWord("Bindu007", 8));

	}

}
