package Recursion;

public class LastIndexOfANumber {
	public static int lastIndex(int arr[],int x, int si) {
		if(si == arr.length) {
			return -1;
		}
		int k = lastIndex(arr, x, si+1);
		if(k != -1) {
			return k;
		}else {
			if(arr[si] == x) {
				return si;
			}else {
				return -1;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {5,19,6,9,3};
		int x = 3;
		int result = lastIndex(arr,x,0);
		System.out.println(result);
	}

}
