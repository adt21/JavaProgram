package string;

import java.util.Scanner;

public class Capitalize1stAndLastChar {
	
	public static String capitalize(String str) {
		StringBuffer sb = new StringBuffer(str);
		int n = str.length();
		//setCharAt(index, char) char the character at particular index
		for(int i = 0; i < n; i++) {
			if( i == 0 || i == (n-1)) {
				sb.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else if(str.charAt(i) == ' ') {
				sb.setCharAt(i-1, Character.toUpperCase(str.charAt(i-1)));
				sb.setCharAt(i+1, Character.toUpperCase(str.charAt(i+1)));
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {		
	        Scanner s = new Scanner(System.in);	        
	        System.out.println("Enter a string");
	        String str = s.nextLine();
	        System.out.println(capitalize(str));
	        
	}
}