package Array;

public class ReverseArray {
	
	public static void reverseArray(int arr[], int n) {
		System.out.print("The original array is: ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.print("The reverse array is: ");
		for(int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[] = {5, 4, 3, 2, 1};
		int n = arr.length;
		reverseArray(arr, n);

	}

}
