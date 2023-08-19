package SAP;

//average case time complexity = O(n^2) and best case O(n)
public class BubbleSort {
	public static int[] bubbleSort(int arr[], int n) {
		if(n == 1) {
			return arr;
		}
		for(int i = 0; i < n-1; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return bubbleSort(arr, n-1);
	}

	public static void main(String[] args) {
		int arr[] = {4,3,6,8,1,5};
		int n = arr.length;
		bubbleSort(arr,n);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
