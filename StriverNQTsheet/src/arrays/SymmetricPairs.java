package arrays;

public class SymmetricPairs {

	public static void main(String[] args) {
		int n = 5;
		int arr[][] = { {1,2}, {2,1}, {3,4}, {4,5}, {5,4}};
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
					System.out.println("(" + arr[j][0] + ", " + arr[j][1] + ")");
					break;
				}
			}
		}

	}

}
