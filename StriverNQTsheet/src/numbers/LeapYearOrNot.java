package numbers;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Year: ");
		int n = s.nextInt();
		
		if(((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0)) {
			System.out.println("The Year is Leap Year");
		}else {
			System.out.println("The Year is not Leap Year");
		}

	}

}
