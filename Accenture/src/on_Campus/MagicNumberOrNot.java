package on_Campus;

import java.util.Scanner;

public class MagicNumberOrNot {
	
	public static boolean isMagic(int n){
		int sum = 0;
		while(n > 0 || sum > 9) {
			if(n == 0) {
				/*
				 * suppose the given number is 532 so 1st of all we will divide it by 10 and will get the remainder
				 * gradually 2, 3, 5 and when the remainder is 5 then quotient(n) = 0 and sum = 10
				 * in that time we need again addition of 10 (1 + 0) but n = 0. now here you need to assign
				 * the value of the sum into n (n = sum) and again initialize the value of the sum = 0
				 * that's why we write n = sum and sum = 0;
				 */
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n = n/10;
		}
		return (sum == 1);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if(isMagic(n)) {
			System.out.println("The number is a magic number");
		}else {
			System.out.println("The number is not a magic number");
		}
	}

}
