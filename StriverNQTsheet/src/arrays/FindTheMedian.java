package arrays;

import java.util.Arrays;

public class FindTheMedian {
	
	public static void getMedian(int arr[], int n) {
		Arrays.sort(arr);
		if(n % 2 == 0) {
			int index1 = (n-1)/2;
			int index2 = (n/2);
			System.out.println((double)(arr[index1] + arr[index2])/2);
		}else {
			System.out.println(arr[(n/2)]);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {5,3,4,2,1,6};
		getMedian(arr, arr.length);
	}

}
