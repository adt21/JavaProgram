package fundamentals;
import java.util.Scanner;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int digits = 0, num = n;
		while(num>0) {
			digits++;
			num/=10;
		}
		//after this loop end num will become 0 as loop already iterated till 0
		//that's why we need to declare again num= n for next while loop
		int armstrong = 0;
		num = n; // again declaration
		while(num>0) {
			int lastDigit = num%10;
			armstrong += Math.pow(lastDigit, digits);
			num/=10;
		}
		if(armstrong == n) {
			System.out.println(n + " is a armstrong number");
		}
		else {
			System.out.println(n + " is not a armstrong number");
		}
	}

}
