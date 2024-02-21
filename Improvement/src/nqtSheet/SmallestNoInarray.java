package nqtSheet;

public class SmallestNoInarray {
	
	public static void smallest(int arr[], int n) {
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arr[] = {2,7,1,9,5};
		int n = arr.length;
		smallest(arr, n);

	}

}
