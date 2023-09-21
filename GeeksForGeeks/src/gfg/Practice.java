package gfg;

import java.util.ArrayList;
import java.util.HashMap;

public class Practice {

	public static ArrayList<Integer> removeConsecutive(int arr[]) {

		ArrayList<Integer> a = new ArrayList<>();
		HashMap<Integer, Boolean> h = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (h.containsKey(arr[i])) {
				continue;
			}
			a.add(arr[i]);
			h.put(arr[i], true);
		}
		return a;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 2, 5, 7 };
		ArrayList<Integer> a = removeConsecutive(arr);
		System.out.println(a);
	}
}