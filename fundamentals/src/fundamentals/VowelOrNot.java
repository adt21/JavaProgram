package fundamentals;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c + " is Vowel");
			break;
		default:
			System.out.println(c + " is consonent");
		}
	}

}
/*
 * if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || 
 * c == 'O' || c == 'U'){
 * 
 * return true;
 * }else{
 * return false;
 * }
 * 
 */
