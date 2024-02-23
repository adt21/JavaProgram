package nqtSheet;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter year ");
		int year = s.nextInt();
		if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println("YES! It is a leap year");
		}else {
			System.out.println("NO! It is not a leap year");
		}

	}

}
