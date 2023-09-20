package fundamentals;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3;
		int count = s.nextInt();
		for(int i = 1; i <= count; i++){
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
	}

}
