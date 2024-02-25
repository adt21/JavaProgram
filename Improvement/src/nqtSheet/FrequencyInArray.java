package nqtSheet;

public class FrequencyInArray {
	
	public static void frequency(int arr[], int n) {
		boolean b[] = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(b[i] == true) {
				continue;
			}
			int count = 1;
			for(int j = i+1; j < n; j++) {
				if(arr[i] == arr[j]) {
					b[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
	}

	public static void main(String[] args) {
		int arr[] = {4, 5, 7, 9, 8, 4, 6, 4, 5, 5, 5};
		int n = arr.length;
		frequency(arr, n);
	}

}
