package numbers;

import java.util.Scanner;

public class FibonacciSeriesTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3;
		System.out.println("Enter the range");
		int count = s.nextInt();
		
		for(int i = 0; i <= count; i++) { //print till count from 0 index so total no = 6
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		

	}

}
