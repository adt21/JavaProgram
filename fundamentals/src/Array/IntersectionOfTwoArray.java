package Array;

import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArray {
	
	public static void intersection(int a[], int b[]) {
		HashMap<Integer, Boolean> h = new HashMap<>();
		for(int i = 0; i < a.length; i++) {
			h.put(a[i], true);
		}
		for(int j = 0; j < b.length; j++) {
			if(h.containsKey(b[j])) {
				System.out.print(b[j] + " ");
			}
		}
		
	}

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4};
		int b[] = {3,2,6};
		Arrays.sort(a);
		Arrays.sort(b);
		intersection(a, b);
	}

}
