package fundamentals;
import java.util.Scanner;
public class ReverseOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // n = 152
		int temp = n , revNum = 0;
		while(temp > 0) {
			int lastDigit = temp % 10; // 2 ,5, 1
			revNum = revNum * 10 + lastDigit; // 2, 25, 251
			temp = temp/10; // 15, 1, 0(iteration end here as temp > 0)
			
		}
		System.out.print(revNum);
	}

}
