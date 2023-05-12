package fundamentals;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;
		int sum = 0;
		while(n>0) {
			int lastDigit = n % 10;
			sum = sum*10 + lastDigit;
			n = n/10;
		}
		if(temp == sum) {
			System.out.println("it is a palindrome number");
		}
		else {
			System.out.println("it is not a palindrome number");
		}
	}

}
