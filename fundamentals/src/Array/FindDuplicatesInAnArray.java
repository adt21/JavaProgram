package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInAnArray {
	
	public static ArrayList<Integer> duplicates(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> h = new HashSet<>();
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(! set.contains(arr[i])){
                set.add(arr[i]);
            }else{
                h.add(arr[i]);
            }
        }
        if(h.size() == 0){
            h.add(-1);
        }
        return new ArrayList<Integer>(h);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 2, 4, 4, 3};
		int n = arr.length;
		System.out.println(duplicates(arr, n));
	}

}
