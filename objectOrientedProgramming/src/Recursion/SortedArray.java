package Recursion;

public class SortedArray {
	
	public static boolean isSorted(int a[], int startIndex) {
//		if(a.length == 1) {
//			return true;
//		}
//		if(a[0] > a[1]) {
//			return false;
//		}
//		int[] smallArray = new int[a.length - 1]; // new array
//		for(int i = 1; i < a.length ; i++) {
//			smallArray[i - 1] = a[i]; // copy array element from the given array
//		}
//		boolean isSmallSortedArray = isSorted(smallArray);
//		return isSmallSortedArray; // this process is lengthy here we need to create a new small array
		//And we need to copy element from previous array that's why lengthy process
		if(startIndex == a.length - 1) { // it is a shortcut process
			return true;
		}
		if(a[startIndex] > a[startIndex + 1]) {
			return false;
		}
		boolean isSortedArray = isSorted(a, startIndex + 1);
		return isSortedArray;
	}

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int si = 0;
//		boolean isSort = isSorted(a);
//		System.out.println(isSort);
		boolean isSort = isSorted(a, si);
		System.out.println(isSort);
	}

}
