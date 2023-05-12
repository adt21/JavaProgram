package functions;
import java.util.Scanner;
public class NcR {
// Formula of NcR = n!/(r!(n - r)!), so we need to initialize two variable(n,r) to calculate it
// we use here three for loop , one for n!, second is r!, third is (n - r)!
// But it makes redundancy so we do it again using functions
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int factN = 1;
		for(int i = 1; i<=n; i++) {
			factN = factN * i;
		}
		int factR = 1;
		for(int i = 1; i<=r; i++) {
			factR = factR * i;
		}
		int factNR = 1;
		for(int i = 1; i<= n - r; i++) {
			factNR = factNR * i;
		}
		int result = factN/(factR * factNR);
		System.out.print(result);
	}

}
