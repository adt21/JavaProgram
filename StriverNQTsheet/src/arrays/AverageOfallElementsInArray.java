package arrays;

public class AverageOfallElementsInArray {
	
	public static void average(int arr[], int n) {
		
		double sum = 0;
		for(int i = 0; i < n; i++) {
			sum += arr[i];
		}
		
		double result = sum/n;
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		int arr[] = {7,6,5,3,2};
		average(arr, arr.length);
		
	}

}
