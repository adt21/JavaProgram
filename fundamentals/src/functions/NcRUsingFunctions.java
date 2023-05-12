package functions;
import java.util.Scanner;
public class NcRUsingFunctions {
	public static int factorial(int num) { // syntax of function
		// after public static write (output datatype) then (function name) then (input type)
		int fact = 1;
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact; // After return we will write that variable which result has here in this functions we have "fact" variable
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		
		int factN = factorial(n); // call the function
		int factR = factorial(r); // call the function
		int factNR = factorial(n - r); // call the function
		
		int result = factN / (factR * factNR);
		System.out.print(result);
	}

}
