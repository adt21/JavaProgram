package Array;
import java.util.Scanner;
public class SumOfArray {
	public static int sum(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	public static void printingArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the elements of the array"+ " " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takingInput();
		printingArray(arr);
		int r = sum(arr);
		System.out.print(r);
	}

}
