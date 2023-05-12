package functions;

public class EvenNumbers {
	
	//*Find Even numbers 1 to 100*
//	public static void printEvenNumbers() {
//		for(int i = 2; i <= 100; i += 2) {
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String[] args) {
//		printEvenNumbers();
//	}
	
	// *print even numbers within a range*
	public static void findEvenNumbers(int start, int end) {
		if(start % 2 != 0) {
			start++;
		}
		for(int i = start; i <= end; i += 2) {
			System.out.println(i);
		}
	}
		public static void main(String[] args) {
			findEvenNumbers(3,19);
		}
  
}
