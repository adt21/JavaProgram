package arrays;
//revision needed
import java.util.Arrays;

public class CountFrequencyOfEachElement {
	
	public static void frequency(int arr[], int n) {
		
		boolean visited[] = new boolean[n];
		Arrays.fill(visited, false); // Arrays.fill() means each and every element in the array will fill with false
		
		for(int i = 0; i < n; i++) {
			if(visited[i] == true) {
				continue;
			}
			int count = 1;
			for(int j = i + 1; j < n; j++) {
				if(arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}
			System.out.println(arr[i] + " " + count);
		}
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,2, 6, 9, 6, 8};
		int n = arr.length;
		frequency(arr, n);

	}

}
