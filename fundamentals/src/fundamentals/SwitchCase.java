package fundamentals;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = s.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		default:
			System.out.println("Please, Enter the valid number");
		}
	}
}
