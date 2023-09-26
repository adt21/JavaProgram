package SAP;

public class Problem1 {
	
	public static int memServer(int[] arr) {
		int ans = 0;
		for(int i = 0; i < arr.length; i += 2) {
			ans += arr[i];
		}
		
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {2, -3, 8, -6, -7, 18, 1};
		int result = memServer(arr);
		System.out.println(result);
	}

}
