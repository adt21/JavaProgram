package Array;

public class ReverseArrayInGroupsGFG {
	
	public static void reverse9(int arr[],int n, int k) { //here k = sub-array group of size
		for(int i = 0; i < n; i += k) {
			int left = i;
			int right = Math.min(i + k - 1, n -1);
			while(left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,3,2,4,5,6,8};
		int n = arr.length;
		int k = 4;
		reverse9(arr, n, k);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
