package Array;
import java.util.Scanner;
public class LargestElement {
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		//for taking input we take a for loop
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the element at " + " " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int largestNumber(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int arr[] = takingInput();
		int lar = largestNumber(arr);
		System.out.println(lar);
	}

}
