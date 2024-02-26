package nqtSheet;

import java.util.Arrays;

//it is the same question as ArrayOperation class. Just in different way
public class ArrayOperation1 {
	
	public static int[] modify(int arr[]) {
		int n = arr.length;
		int result[] = new int[n];
		for(int i = 0; i < n; i++) {
			result[i] = arr[(i + 1) % n] * arr[(i + 2) % n];
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int ans[] = modify(arr);
		System.out.println(Arrays.toString(ans));
	}

}
