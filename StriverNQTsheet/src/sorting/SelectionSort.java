package sorting;

public class SelectionSort {
	
	public static void selection(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = -1;
			for(int j = i; j < n; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = {13,46,24,52,20,9};
		int n = arr.length;
		selection(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
