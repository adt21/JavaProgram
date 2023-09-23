package Array;

import java.util.ArrayList;

public class FirstAndLastOcurranceOfNo {
	
	public static ArrayList<Integer> occurance(int arr[],int n, int x){
		ArrayList<Integer> list = new ArrayList<>();
		int left = 0, right = n-1;
		while(left <= right) {
			if(arr[left] == x && arr[right] == x) {
				list.add(left);
				list.add(right);
				break;
			}
			if(arr[left] != x) {
				left++;
			}
			if(arr[right] != x) {
				right--;
			}
		}
		if(list.isEmpty()) {
			list.add(-1);
			list.add(-1);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,5,5,5,5,8,9};
		int x = 10;
		int n = a.length;
		ArrayList<Integer> arr = occurance(a, n, x);
		System.out.println(arr);
		
	}

}
