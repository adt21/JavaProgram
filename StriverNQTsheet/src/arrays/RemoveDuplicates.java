package arrays;

import java.util.ArrayList;
import java.util.HashMap;

//import java.util.HashSet;

public class RemoveDuplicates {

	public static ArrayList<Integer> remove(int arr[], int n) {
//		HashSet<Integer> set = new HashSet<>();
//		for(int i = 0; i < n; i++) {
//			set.add(arr[i]);
//		}
//		System.out.println(set);
//	}
//

		HashMap<Integer, Boolean> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				continue;
			}
			list.add(arr[i]);
			map.put(arr[i], true);
		}
		return list;
	}

	public static void main(String[] args) {

		int arr[] = { 4, 2, 7, 2, 1, 9, 9, 1 };
		ArrayList<Integer> list = remove(arr, arr.length);
		System.out.println(list);
	}
}
