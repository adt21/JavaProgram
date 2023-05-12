package fundamentals;
import java.util.Scanner;
public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p = s.nextInt();
		int result = (int) Math.pow(n, p);
		System.out.println(result);
	}

}
