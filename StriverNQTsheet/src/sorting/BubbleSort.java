package sorting;

public class BubbleSort {
	
	public static void bubble(int arr[], int n) {
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {13,46,24,52,20,9};
		int n = arr.length;
		bubble(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}
