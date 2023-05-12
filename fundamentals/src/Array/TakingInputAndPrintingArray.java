package Array;
import java.util.Scanner;
public class TakingInputAndPrintingArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		// for taking input you need a for loop 
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the value at"+ " " + i + "th index");
			arr[i] = s.nextInt(); // for taking input at ith position we write it
		}
		// for printing array we also taking another for loop
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
