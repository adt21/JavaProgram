package functions;
import java.util.Scanner;
public class AddTwoNumbers {
	public static int Sum(int a, int b) {
		int ans = a + b;
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int add = Sum(a,b);
		System.out.print(add);
	}

}
