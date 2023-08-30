package on_Campus;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveConsecutive {
	
	public static ArrayList<Integer> removeDuplicates(int[] arr){
		ArrayList<Integer> output = new ArrayList<>();
		HashMap<Integer, Boolean> hash = new HashMap();
		for(int i = 0; i < arr.length; i++) {
			if(hash.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			hash.put(arr[i], true);
		}
		return output;
	}

	public static void main(String[] args) {
		int arr[] = {1, 1, 2, 2, 3, 4};
		ArrayList<Integer> output = removeDuplicates(arr);
		System.out.println(output);

	}

}
