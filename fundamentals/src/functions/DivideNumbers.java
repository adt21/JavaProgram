package functions;
import java.util.Scanner;
public class DivideNumbers {
	public static double division(double a , int b) {
		double ans = a/b;
		System.out.print(ans);
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double a = s.nextDouble();
		int b = s.nextInt();
		division(a,b);
	}

}
