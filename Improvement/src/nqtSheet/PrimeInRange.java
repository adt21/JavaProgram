package nqtSheet;

public class PrimeInRange {
	
	public static boolean isPrime(int num) {
	    if (num == 1 || num == 0)
	      return false;
	    for (int i = 2; i < num; i++) {
	      if (num % i == 0)
	        return false;
	    }
	    return true;
	  }
	  public static void PrintPrimesbwrange(int a, int b) {
	    for (int i = a; i <= b; i++) {
	      if (isPrime(i)) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	  public static void main(String args[]) {
	    int a = 1, b = 10;
	    PrintPrimesbwrange(a, b);
	  }
	
}
