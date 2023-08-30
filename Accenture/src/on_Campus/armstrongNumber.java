package on_Campus;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int temp = n, sum = 0, count = 0;
		
		while(temp > 0) {
			count++;
			temp = temp/10;
		}
		temp = n;
		while(temp > 0) {
			int lastDigit = temp % 10;
			sum = (int) (sum + Math.pow(lastDigit, count));
			temp /= 10;
		}
		if(n == sum) {
			System.out.println('1');
		}else {
			System.out.println('0');
		}

	}

}
