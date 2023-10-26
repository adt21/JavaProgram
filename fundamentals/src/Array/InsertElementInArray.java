package Array;

public class InsertElementInArray {
	
//This is the code for insert element in the array	
	public static void insert(int arr[], int n, int x, int pos) { //pos = at which position you want to insert element, x = the element you want to insert
		
		int newArr[] = new int[n+1];
		for(int i = 0; i < n; i++) {
			newArr[i] = arr[i];
		}
		for(int i = n; i > pos; i--) {
			newArr[i] = arr[i-1];
		}
		newArr[pos] = x;
		
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
	    int n = arr.length;
	    int x = 9;
	    int pos = arr.length;
	    insert(arr, n, x, pos);
	}

}
