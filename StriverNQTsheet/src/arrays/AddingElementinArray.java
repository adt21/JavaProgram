package arrays;

public class AddingElementinArray {
	
	public static void insertAtEnd(int arr[], int n, int x) {
		for(int i = 0; i <= n; i++) {
			arr[n] = x;
		}
	}
	
	public static void insertbeginning(int arr[], int n, int x) {
		for(int i = n-1; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		arr[0] = x;
	}

	public static void main(String[] args) {
		int n = 6;
		int arr[] = {2,3,4,5,6,7,0};
		System.out.println("Before inserting element");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("After inserting the element");
		insertAtEnd(arr, n, 1); // or write insertbeginning(arr, n, 1)
		for(int i = 0; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
