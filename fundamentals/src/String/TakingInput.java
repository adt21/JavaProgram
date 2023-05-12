package String;
import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.next();
		System.out.println(str1 + " " + str1.length());
		String str2 = s.next();
		System.out.println(str2 + " " + str2.length());
		String str3 = s.nextLine();
		System.out.println(str3 + " " + str3.length());
		
		
	}

}
/* In java in the case of String when we enter a sentence with space then for this space 
 * string split into token, for the first time when you print then only 1st part before 1st space
 * will be printed , this white space is called here delimiter*/

//when you use s.next() then only this occurance will be happen
//but when you use s.nextLine() then whole string will be printed


