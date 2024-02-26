package nqtSheet;

/*
 * You have given an integer array of 3 element like {1,2,3} and you have to return this {6, 3, 2}
	that means in the position of 0th index replace the number 1 with the multiplication of 2 & 3 (1st & 2nd index) , same process for other two index 
	instead 2 write (1*3)
	instead 3 write (2*1)

 */

public class ArrayOperation {
	
	public static int[] modified(int arr[]) {
		int n = 3;
		int result[] = new int[n];
		for(int i = 0; i < n; i++) {
			int product = 1;
			for(int j = 0; j < n; j++) {
				if(j != i) {
					product *= arr[j];
				}
			}
			result[i] = product;
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		int ans[] = modified(arr);
		for(int r: ans) {
			System.out.print(r + " ");
		}
		
	}

}
