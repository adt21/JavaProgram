package Array;

public class PrintAllPairs {
	public static void printAllpairs(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n - 1; i++) { // as at 4th index(5) there is no pair will be occured thats why i will be iterted upto n-2
			for(int j = i + 1; j < n; j++) {
				System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,4,7,6,5};
		printAllpairs(arr);
	}

}
