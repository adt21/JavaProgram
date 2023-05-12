package fundamentals;
import java.util.Scanner;
public class ProductOfAllNaturalnumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int product = 1;
		for(int i = 1; i<= n; i++) {
			product = product * i;
		}
		System.out.println("product of numbers is = " + product);

	}

}
