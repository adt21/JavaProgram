package SAP;

public class SelectionSort {
	
	public static void selectionSort(int arr[]) {
		int n = arr.length;
		for(int i = 0; i <= n - 2; i++) {
			int min = i;
			for(int j = i; j <= n - 1; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,3,9,6,7};
		selectionSort(arr);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
