package arrays;

public class RotateArrayByKPlaces {
	
	public static void reverse(int arr[] , int start, int end) {
		while(start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void rotate(int arr[], int n, int d) { // d = no of rotation
		
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		
	}

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		int n = arr.length;
		int d = 3;
		rotate(arr, n, d);
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
