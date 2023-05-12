package String;
import java.util.*;
public class StringBuffer {
	
	public static void main(String args[]) {
		String str = "How are you";
		String arr[] = str.split(" ");
		//System.out.println(Arrays.toString(arr));
		String output = "";
		for(String s : arr) {
			
			output += reverse(s) + " ";
		}
		System.out.println(output.trim());
		
		
	}
	static String reverse(String str) {
		String revWord = "";
		for(int i = str.length()-1; i>=0; i--) {
			revWord += str.charAt(i);
		}
		return revWord;
	}
	
}
//superset //mettle
