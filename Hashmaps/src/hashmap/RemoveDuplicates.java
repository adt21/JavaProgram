package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
	
	private static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				continue; //direct go to the beginning of the loop for next iteration
			}
			
			output.add(arr[i]);
			map.put(arr[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,2,2,3,1,6,2,5};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.println("Output is: " + output);
	}

}
