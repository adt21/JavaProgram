package arrays;

public class SubArray {
	
	public static void subArr(int arr[], int n) {
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) { // this loop is for iteration from i to j (Like 1..1,2..1,2,3..2..2,3..3)
				for(int k = i; k <= j; k++) { //this loop is for printing element from i to j
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		subArr(arr, n);

	}

}
