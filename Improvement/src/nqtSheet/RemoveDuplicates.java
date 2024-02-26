package nqtSheet;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	public static ArrayList<Integer> duplicates(int arr[]){
		HashMap<Integer,Boolean> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue;
			}
			list.add(arr[i]);
			map.put(arr[i], true);
			
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,2,2,3,1,6,2,5};
		ArrayList<Integer> output = duplicates(arr);
		System.out.println("Output is: " + output);

	}

}
