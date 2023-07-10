package problems;

public class ReturnTwoIndices {
	
	 public static int[] twoSum(int[] arr, int target) {

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == target) {
	                    return new int[]{i, j}; // if solution is found here then this line will be executed and after executing it will reach direct where the method called
	                }
	            }
	        }
	        return new int[]{}; // this line will be executed when no solution is found at line no 10 as well as from the loop,,when we will not get our anser
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 6, 8};
	        int target = 14;
	        int[] indices = twoSum(arr, target);
	        /*sometimes it may happen there is such no value, we found then "twosum" method 
	         * return an empty array as per line no 10, that's we need check the array before printing it
	         * that's we have written below if condition
	         */
	        if (indices.length == 2) {
	            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
	            System.out.println("Values: " + arr[indices[0]] + ", " + arr[indices[1]]);
	        } else {
	            System.out.println("No two indices found.");
	        }
	    }
}
