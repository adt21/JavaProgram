package fundamentals;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a > b && a > c) {
			System.out.print(a + " " + "is a greater number");
		}
		else if(b > c && b > a) {
			System.out.print(b + " " + "is a greater number");
		}
		else {
			System.out.print(c + " " + "is a greater number");
		}
	}

}
