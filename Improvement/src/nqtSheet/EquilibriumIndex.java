package nqtSheet;

public class EquilibriumIndex {
	
	public static int equilibrium(int arr[]) {
		int totalSum = 0;
		for(int i = 0; i < arr.length; i++) {
			totalSum += arr[i];
		}
		int leftSum = 0;
		for(int i = 0; i < arr.length; i++) {
			totalSum -= arr[i];
			if(leftSum == totalSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,-1,4};
		int ans = equilibrium(arr);
		System.out.println(ans);

	}

}
