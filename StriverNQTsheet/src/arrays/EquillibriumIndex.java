package arrays;

public class EquillibriumIndex {
	
	public static int equillibrium(int arr[], int n) {
		int totalSum = 0;
		for(int i = 0; i < n; i++) {
			totalSum += arr[i];
		}
		
		int leftSum = 0;
		for(int i = 0; i < n; i++) {
			totalSum -= arr[i];
			if(leftSum == totalSum) {
				return i;
			}
			leftSum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int nums[] = {2,3,-1,8,4};
		int ans = equillibrium(nums, nums.length);
		System.out.println(ans);
	}

}

