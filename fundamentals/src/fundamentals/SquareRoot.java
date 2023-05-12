package fundamentals;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 0, sq = 0;
		while(i*i <= n) {
			sq = i;
			i+=1;
		}
		System.out.println(sq);
	}

}
