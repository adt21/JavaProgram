package fundamentals;
import java.util.Scanner;
public class TcsDigital1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = (int) Math.pow(n, 2);
		String s = Integer.toString(result);//result + "";// convert integer to string
		int r1 = (Integer.toString(n)).length();
		int r2 = s.length();
		String str = s.substring(r2-r1);
		int x = Integer.parseInt(str);//convert string to integer
		if(n == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}

