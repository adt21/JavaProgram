package arrays;

public class EquilibriumPoint {
	
	public static int equilibrium(int arr[], int n) {
		int totalSum = 0;
		for(int i = 0; i < n; i++) {
			 totalSum += arr[i];
		}
		
		int leftSum = 0;
		for(int i = 0; i < n; i++) {
			totalSum -= arr[i];
			
			if(totalSum == leftSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {2, 3, -1, 8, 4};
		int n = arr.length;
		int ans = equilibrium(arr, n);
		System.out.println(ans);

	}

}
