package practice;

//factorial print between 1 to n 
public class FactorialPrintTillN {

	public static void main(String[] args) {
		int n = 10;
		
		for(int i = 1; i <= n; i++) {
			int fact = 1;
			for(int j = 1; j <= i; j++) {
				fact = fact * j;
			}
			System.out.print(fact + " ");
		}

	}

}
