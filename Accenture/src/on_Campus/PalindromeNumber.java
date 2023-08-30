package on_Campus;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n, sum = 0;
		
		while(temp > 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp = temp/10;
		}
		if(n == sum) {
			System.out.println("Number is Palindrome");
		}else {
			System.out.println("Number is not Palindrome");
		}
		
	}

}
