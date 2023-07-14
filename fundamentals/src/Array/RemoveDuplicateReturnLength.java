package Array;

public class RemoveDuplicateReturnLength {
	
	public static int removeduplicate(int arr[]) {
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[j] != arr[i]) {
				arr[++j] = arr[i];
			}
		}
		return j+1;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,2,2,2,2,3,3,4};
		System.out.println(removeduplicate(arr));

	}

}
