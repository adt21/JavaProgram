package Array;

import java.util.ArrayList;

public class RemoveDuplicate {
	
	public static ArrayList<Integer> removeDuplicate(int arr[]){
		int n = arr.length;
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for(int i = 1; i < n; i++) {
			if(arr[i] != arr[i-1]) {
				ans.add(arr[i]);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {0,0,1,1,2,2,2,3,3,4};
		int n = arr.length;
		ArrayList<Integer> result = removeDuplicate(arr);
		for(int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i) + " ");
		}

	}

}
