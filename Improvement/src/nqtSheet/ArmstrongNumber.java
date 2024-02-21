package nqtSheet;
import java.util.Scanner;
public class ArmstrongNumber {
	
	public static boolean isArmstrong(int n) {
		int temp = n, sum = 0, count = 0;
		while(n > 0) {
			++count;
			n = n/10;
		}
		n = temp;
		while(n > 0) {
			int rem = n % 10;
			sum = (int) (sum + Math.pow(rem, count));
			n = n/10;
		}
		return temp == sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = s.nextInt();
		boolean b = isArmstrong(n);
		System.out.println(b);

	}

}
