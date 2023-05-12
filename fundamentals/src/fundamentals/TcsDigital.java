package fundamentals;
import java.util.Scanner;
public class TcsDigital {
	public static int digits(int n) {
		int sum = 0;
		while(n>0){
			int lastDigit = n % 10;
			sum = sum + lastDigit;
			n = n / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = digits(n);
		int x = r;
		if(x <= 9) {
			System.out.println(x);
		}else {
			x = digits(x);
			if(x < 9) {
				System.out.println(x);
			}
		}
	}

}
