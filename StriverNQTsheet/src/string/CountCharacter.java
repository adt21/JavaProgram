package string;

// Count the vowel, consonants and white space

public class CountCharacter {
	
	public static void count(String str) {
		int count1 = 0, count2 = 0, count3 = 0;
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count1++;
			}
			else if(c >= 'a' && c <= 'z') {
				count2++;
			}
			else if(c == ' '){
				count3++;
			}
		}
		System.out.println("Vowel: " + count1);
		System.out.println("Consonants: " + count2);
		System.out.println("Whitespaces: " + count3);
		
	}

	public static void main(String[] args) {
		String str = "India won the cricket match";
		count(str);

	}

}
