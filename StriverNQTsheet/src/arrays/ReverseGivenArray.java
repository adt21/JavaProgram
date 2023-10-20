package arrays;

public class ReverseGivenArray {
	
	public static void reverse(int arr[]) {
		
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1,0};
		
		reverse(arr);
	}

}
