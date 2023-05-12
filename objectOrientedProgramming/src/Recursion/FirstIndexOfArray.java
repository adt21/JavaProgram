package Recursion;

public class FirstIndexOfArray {
	public static int firstIndex(int[] arr, int si, int x) {
		if(si == arr.length) { // si = a.length means si = 6 but we know starting index = 0 
			//so array length from 0 to 9 as array length = 10 // si means start index
			return -1;
		}
		if(arr[si] == x) { //it means given array index no = given number index then return that index
			return si;
		}
		int k = firstIndex(arr, si + 1, x);
		return k;
		
	}

	public static void main(String[] args) throws Exception {
		int[] arr = {2,3,6,9,10,12};
		int x = 10; 
		int result = firstIndex(arr,0,x);
		System.out.println(result);
	}

}
