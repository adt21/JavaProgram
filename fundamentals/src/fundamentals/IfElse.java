package fundamentals;
import java.util.Scanner;
public class IfElse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if(a == 1) {
			System.out.print("You are finally Placed");
		}
		else {
			System.out.println("You are not placed");
		}
	}

}
