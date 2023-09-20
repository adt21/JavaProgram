package Array;

import java.util.ArrayList;


public class IndexEqualValue {
	public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] == i + 1){
                output.add(i+1);
            }
        }
        return output;
    }

	public static void main(String[] args) {
		int n = 5;
		int[] arr = {2,1,3,4,8};
		System.out.println(valueEqualToIndex(arr, n));
	}

}
