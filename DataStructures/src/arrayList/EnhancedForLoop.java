package arrayList;

import java.util.ArrayList;

public class EnhancedForLoop {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		for(int i: arr) { // here i is value of array list element
			System.out.println(i);
		}

	}

}
