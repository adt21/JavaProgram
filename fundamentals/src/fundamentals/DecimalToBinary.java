package fundamentals;
import java.util.Scanner;
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int binary = 0, pow = 1;
		while(n > 0) {
			int rem = n % 2;
			binary = binary + rem * pow;
			n = n/2;
			pow*=10;
		}
		System.out.print(binary);
	}

}
