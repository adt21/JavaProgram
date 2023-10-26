package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class FindRepeatingElement {
	
	public static ArrayList<Integer> findDuplicate(int arr[], int n){
		ArrayList<Integer> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < n; i++) {
			if(! set.contains(arr[i])) {
				set.add(arr[i]);
			}else {
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int arr[] = {1,1,4,6,4,8,9};
		ArrayList<Integer> a = findDuplicate(arr, arr.length);
		System.out.println(a);
		

	}

}
