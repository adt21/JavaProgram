package fundamentals;
import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int pow = 1; // Here pow(power) = placevalue. As radix of binary = 2, so placevalue start from 2^0 = 1
		int decimal = 0;
		while(n>0) {
			int lastDigit = n%10;
			decimal = decimal + lastDigit*pow;
			n = n/10;
			pow*=2;
		}
		System.out.print(decimal);
		
	}

}

// Using for loop the program will be:
//int n = s.nextInt();
//int i = 1; // Here i = place value. As radix of binary = 2, so place value start from 2^0 = 1
//int decimal = 0;
//for(i = 1; n>0; i*=2) { // till n>0 as well as n = 1, the loop will continue iterated.
//	int lastDigit = n%10;
//	decimal = decimal + lastDigit*i;
//	n = n/10;
//}
//System.out.print(decimal);
