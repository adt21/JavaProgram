package Oops;
import java.util.Scanner;
public class SumOfTwonumber {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the 1st number: ");
		int a = s.nextInt();
		System.out.print("Enter the 1st number: ");
		int b = s.nextInt();
		
		int sum = a + b;
		System.out.println("Sum of two number is: " + sum);
		
	}
}
