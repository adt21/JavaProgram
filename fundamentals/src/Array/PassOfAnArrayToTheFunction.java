package Array;

public class PassOfAnArrayToTheFunction {
	public static void printingArray(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void incrementArray(int arr[]) {
		//System.out.println(arr);
		//arr = new int[7]; // here new integer array is declared that's why the address is not accessible anymore
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1; // 2, 3, 4, 5, 6
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		//System.out.println(arr);
		incrementArray(arr);
		printingArray(arr);
	}

}
