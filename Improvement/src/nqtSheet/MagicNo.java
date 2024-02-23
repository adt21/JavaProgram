package nqtSheet;

import java.util.Scanner;

public class MagicNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int sum = 0;
		while(n > 0 || sum > 9) {
			if(n == 0) {
				n = sum;
				sum = 0;
			}
			sum = sum + (n % 10);
			n /= 10;
		}
		if(sum == 1) {
			System.out.println("YES! It is a magic number");
		}else {
			System.out.println("No! It is not a magic number");
		}
	}

}
