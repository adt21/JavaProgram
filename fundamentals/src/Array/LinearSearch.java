package Array;
import java.util.Scanner;
public class LinearSearch {
	public static int[] takingInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Enter the number" + " " + i + "th index");
			arr[i] = s.nextInt();
		}
		return arr;
	}
	public static int linearSearch(int arr[], int x) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//int t = s.nextInt();
		int arr[] = takingInput();
		int x = s.nextInt();
		int r = linearSearch(arr,x);
		System.out.println(r);
	}

}
