package numbers;

import java.util.Scanner;

public class PositiveOrNegetive {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(n == 0) {
			System.out.println("0 is neither positive or negative number");
		}
		else if(n < 0) {
			System.out.println("Number is negative number");
		}else {
			System.out.println("Number is positive number");
		}

	}

}
