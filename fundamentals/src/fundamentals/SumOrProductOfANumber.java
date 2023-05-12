package fundamentals;
import java.util.Scanner;
public class SumOrProductOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int sum = 0;
		int product = 1;
		if(a == 1) {
			for(int i = 1; i<=n; i++) {
				
				sum = sum + i;
			}
			System.out.println(sum);
		}
		else if(a == 2) {
			for(int j = 1; j<=n; j++) {
				product = product * j;
			}
			System.out.println( product);
		}
		else {
			System.out.println(-1);
		}
	
	}

}
