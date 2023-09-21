package Array;

import java.util.HashMap;

public class UnionOfTwoArray {
	public static int union(int a[], int b[]) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			map.put(a[i],true);
		}
		for(int j = 0; j < b.length; j++) {
			if(map.containsKey(b[j])) {
				continue;
			}
			map.put(b[j], true);
		}
		return map.size();
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		int b[] = {1,5,6};
		int r = union(a, b);
		System.out.println(r);

	}

}
