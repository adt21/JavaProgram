package Array;
/*
 * Equilibrium point in an array is a position such that the sum of elements
 *  before it is equal to the sum of elements after it.
 */
public class EquilibriumPointGFG {
	
	public static int equilibrium(int arr[], int n) {
		for(int i = 0; i < n; i++) {
			int left_Sum = 0, right_Sum = 0;
			for(int j = 0; j < i; j++) {
				left_Sum += arr[j];
			}
			for(int k = i+1; k < n; k++) {
				right_Sum += arr[k];
			}
			if(left_Sum == right_Sum) {
				return i + 1; // 1-based index
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,3,5,2,2};
		int n = arr.length;
		int ans = equilibrium(arr, n);
		System.out.println(ans);

	}

}

/* ***This is a optimal solution***
 * 
 * public static int equilibrium(int arr[], int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum -= arr[i]; // Reduce the totalSum by the current element
            if (leftSum == totalSum) {
                return i + 1; // 1-based index
            }
            leftSum += arr[i];
        }

        return -1; // If no equilibrium point is found
    }
*/
