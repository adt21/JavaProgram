package nqtSheet;
/*
 * Given a string, calculate the sum of numbers in a string
 *  (multiple consecutive digits are considered one number)
 *  Example 1:
	Input: string = “123xyz”
	Output: 123
	
	Example 2:
	Input: string = “1xyz23”
	Output: 24
 */
import java.util.Scanner;

public class SumOfNoInString {
	
	public static int sum(String str) {
		String tempSum = "0";
		/*
		 * Here I take tempsum "0" but i didn't take "" (empty) because
		 * suppose the input is xyz23, here 1st char is not a digit so it will go inside		 *
		 * else part and if i took tempsum = "" (empty string) then inside else
		 * sum += Integer.parseInt(Empty String) will give use error that's why i need to put 0
		 * and if the 1st char is a digit e.g 1 then inside if it will be like 01 but that is not a
		 * problem. Because 01 + 1(you can take any number) = 2
		 */
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				tempSum += c;
			}else {
				sum += Integer.parseInt(tempSum);
				tempSum = "0";
			}
		}
		return sum + Integer.parseInt(tempSum); // please do dry run in copy using this input 1xyz23
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = s.nextLine();
		int ans = sum(str);
		System.out.println(ans);

	}

}
